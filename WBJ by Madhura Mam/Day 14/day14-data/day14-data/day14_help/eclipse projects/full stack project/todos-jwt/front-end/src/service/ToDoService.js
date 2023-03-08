import axios from 'axios';
class ToDoService {
  //fetch all todos fro a specific user from backend
  fetchAllToDos(userName) {
    console.log('api call : fetch all');
    return axios.get(`http://localhost:8080/users/${userName}/todos`);
  }
  //fetch a todo by userName n id
  fetchToDo(userName, id) {
    console.log('api call fetch one');
    return axios.get(`http://localhost:8080/users/${userName}/todos/${id}`);
  }
  //delete a todo by username n id
  deleteToDo(userName, id) {
    console.log('api call : del');
    return axios.delete(`http://localhost:8080/users/${userName}/todos/${id}`);
  }
  //update existing todo by username n id
  updateToDo(userName, id, todo) {
    console.log('api call : update');
    return axios.put(
      `http://localhost:8080/users/${userName}/todos/${id}`,
      todo
    );
  }
  //create a new  todo for a particular user
  createToDo(userName, todo) {
    console.log('api call : create');
    return axios.post(`http://localhost:8080/users/${userName}/todos/`, todo);
  }
}
export default new ToDoService();
