import React, { Component } from 'react';
import AuthenticationService from '../../service/AuthenticationService';
import ToDoService from '../../service/ToDoService';
export default class ListToDosComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      todos: [],
      mesg: null,
    };
    //method binding
    this.onDeleteClicked = this.onDeleteClicked.bind(this);
    this.refreshToDos = this.refreshToDos.bind(this);
    this.onUpdateClicked = this.onUpdateClicked.bind(this);
    this.onCreateClicked = this.onCreateClicked.bind(this);
  }
  componentDidMount() {
    console.log('comp did mount');
    this.refreshToDos();
  }
  onDeleteClicked(id) {
    ToDoService.deleteToDo(AuthenticationService.getUserName(), id)
      .then((response) => {
        this.setState({ mesg: `To Do Deleted with ID=${id}` });
        this.refreshToDos();
      })
      .catch((error) => console.log('del error : ', error.response.data));
  }
  onUpdateClicked(id) {
    //redirect to ToDoComponent with specific id
    console.log('in update clicked ', id);
    //redirect to ToDO component
    this.props.history.push(`/todos/${id}`);
  }
  onCreateClicked() {
    //redirect to ToDoComponent : empty form
    console.log('in create clicked ');
    //redirect to ToDO component
    this.props.history.push('/todos/-1');
  }
  refreshToDos() {
    //make API call
    ToDoService.fetchAllToDos(AuthenticationService.getUserName())
      .then((response) => {
        console.log(response.data);
        this.setState({ todos: response.data });
      })
      .catch((error) => console.log('fetch error : ', error.message));
  }
  render() {
    console.log(this.state.todos);
    return (
      <>
        {this.state.mesg && (
          <div className='alert alert-success'>{this.state.mesg}</div>
        )}
        <h3>TO DO List</h3>
        <div className='container'>
          <table className='table'>
            <thead>
              <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Plan-Date</th>
                <th>Completed ? </th>
                <th>Delete </th>
                <th>Update</th>
              </tr>
            </thead>

            <tbody>
              {this.state.todos.map((todo) => (
                <tr key={todo.id}>
                  <td>{todo.id}</td>
                  <td>{todo.desc}</td>
                  <td>{todo.targetDate.toString()}</td>
                  <td>{todo.done.toString()}</td>
                  <td>
                    <button
                      className='btn btn-danger'
                      onClick={() => this.onDeleteClicked(todo.id)}
                    >
                      Delete
                    </button>
                  </td>
                  <td>
                    <button
                      className='btn btn-success'
                      onClick={() => this.onUpdateClicked(todo.id)}
                    >
                      Update
                    </button>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
          <div className='row'>
            <button className='btn btn-success' onClick={this.onCreateClicked}>
              Add ToDo
            </button>
          </div>
        </div>
      </>
    );
  }
}
