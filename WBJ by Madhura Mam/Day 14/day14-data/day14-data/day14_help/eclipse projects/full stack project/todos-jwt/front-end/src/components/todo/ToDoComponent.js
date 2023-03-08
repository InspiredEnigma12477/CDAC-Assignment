import moment from 'moment';
import React, { Component } from 'react';
import { Formik, Form, Field, ErrorMessage } from 'formik';
import ToDoService from '../../service/ToDoService';
import AuthenticationService from '../../service/AuthenticationService';

class ToDoComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      id: this.props.match.params.id,
      desc: '',
      targetDate: moment(new Date()).format('yyyy-MM-dd'),
      done: false,
    };
    this.formSubmitHandler = this.formSubmitHandler.bind(this);
    this.formValidation = this.formValidation.bind(this);
  }
  //life cycle method
  componentDidMount() {
    console.log('todo comp mount', this.state.id);
    console.log(typeof this.state.id);
    if (this.state.id === '-1') {
      console.log('123456');
      return;
    }
    //update todo
    ToDoService.fetchToDo(AuthenticationService.getUserName(), this.state.id)
      .then((response) => {
        console.log(response);
        this.setState({
          desc: response.data.desc,
          targetDate: moment(response.data.targetDate).format('YYYY-MM-DD'),
        });
      })
      .catch((error) => {
        console.log('fetch to do err ', error.message);
      });
  }
  formValidation(values) {
    const errors = {};
    console.log('validate');
    if (!values.desc || values.desc.length < 5)
      errors.desc = 'Blank or Invalid Description';
    if (!moment(values.targetDate).isValid())
      errors.targetDate = 'Invalid Target Date';
    console.log(errors);
    return errors; //If validate method rets empty errors object then
    //it proceeeds to form submission (equivalent to BindingResult)
    //o.w doesn't
  }
  formSubmitHandler(values) {
    console.log('on submit ', values);
    if (this.state.id === '-1') {
      //create new todo
      ToDoService.createToDo(AuthenticationService.getUserName(), {
        desc: values.desc,
        targetDate: values.targetDate,
      })
        .then((response) => {
          console.log('create success');
          console.log(response.data);
          console.log(response.headers, response.status);
          this.props.history.push('/todos');
        })
        .catch((error) => {});
    } else {
      //make api call : update
      ToDoService.updateToDo(
        AuthenticationService.getUserName(),
        this.state.id,
        {
          id: this.state.id,
          desc: values.desc,
          targetDate: values.targetDate,
        }
      )
        .then((response) => {
          console.log('updated data ', response.data);
          this.props.history.push('/todos');
        })
        .catch((error) => {
          console.log('update err', error.message);
        });
    }
  }

  render() {
    // const desc = this.state.desc;
    // const targetDate = this.state.targetDate;
    // const id = this.state.id;
    // const done = this.state.done;
    //Instead use object de-structuring
    const { desc, targetDate, id, done } = this.state;

    return (
      <div>
        <h1>To Do</h1>
        <div className='container'>
          <Formik
            initialValues={{
              desc,
              targetDate,
              id,
              done,
            }}
            onSubmit={this.formSubmitHandler}
            validate={this.formValidation}
            validateOnBlur={false}
            validateOnChange={false}
            enableReinitialize={true}
          >
            {(props) => (
              <Form>
                <ErrorMessage
                  name='desc'
                  component='div'
                  className='alert alert-warning'
                />
                <fieldset className='form-group'>
                  <label>Description</label>
                  <Field className='form-control' type='text' name='desc' />
                </fieldset>
                <fieldset className='form-group'>
                  <label>Plan Date</label>
                  <Field
                    className='form-control'
                    type='date'
                    name='targetDate'
                  />
                </fieldset>
                <button className='btn btn-success' type='submit'>
                  Save
                </button>
              </Form>
            )}
          </Formik>
        </div>
      </div>
    );
  }
}
export default ToDoComponent;
