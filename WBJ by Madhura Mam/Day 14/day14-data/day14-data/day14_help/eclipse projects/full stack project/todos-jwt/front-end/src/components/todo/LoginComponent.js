import React, { Component } from 'react';
import AuthenticationService from '../../service/AuthenticationService';

export default class LoginComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      userName: '',
      pwd: '',
      authenticated: false,
      login: false,
    };
    //bind methods
    this.updateValues = this.updateValues.bind(this);
    this.handleLogin = this.handleLogin.bind(this);
  }
  updateValues(event) {
    this.setState({
      [event.target.name]: event.target.value,
    });
  }
  //event handlers for login
  handleLogin(event) {
    this.setState({ login: true });
    AuthenticationService.authenticateUser(this.state.userName, this.state.pwd)
      .then((response) => {
        console.log('auth success', response);
        AuthenticationService.storeUserDetails(
          this.state.userName,
          response.data.jwt
        );
        this.props.history.push(`/welcome/${this.state.userName}`);
      })
      .catch((error) => {
        console.log('auth failed ', error.message);
      });
  }

  render() {
    return (
      <>
        <h1>Login</h1>
        <div className='container'>
          {this.state.login && this.state.authenticated && (
            <div>Login Successful</div>
          )}
          {this.state.login && !this.state.authenticated && (
            <div className='alert alert-warning'>Invalid Login</div>
          )}
          User Name :{' '}
          <input
            type='text'
            name='userName'
            value={this.state.userName}
            onChange={this.updateValues}
          ></input>
          Password :{' '}
          <input
            type='password'
            name='pwd'
            value={this.state.pwd}
            onChange={this.updateValues}
          ></input>
          <button className='btn btn-success' onClick={this.handleLogin}>
            Login
          </button>
        </div>
      </>
    );
  }
}
//separate functional component to render login related  message

// function ValidateComponent(props) {
//   if (!props.login) return null;
//   if (props.auth) return <div>Login Successful</div>;
//   return <div>Login Failed</div>;
// }
