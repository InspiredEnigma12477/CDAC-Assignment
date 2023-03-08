import React, { Component } from 'react';
import './Counter.css';

export default class Counter extends Component {
  //step 1 : add a constr to init the state of the component
  constructor() {
    super(); //must invoke super before initing the state of the comp
    //init the state : as JS object with properties (eg : counter)
    this.state = {
      counter: 0,
      clr: 'red',
      users: ['Rama', 'Riya', 'Meera'],
    };
    //bind increment method to the class
    /*For a given increment function, creates a bound function 
    that has the same body as the original function. 
    The 'this' object of the bound function is associated with the 
    specified object, and has the specified initial parameters.
     */
    //  this.increment = this.increment.bind(this);
  }
  //render method replaced by the arrow function
  render = () => {
    return (
      <div>
        <h3>Counter</h3>
        <button onClick={this.increment}>+1</button>
        <span className='count'>
          {this.state.counter} in {this.state.clr} color
        </span>
        <h4>Users : {this.state.users.map((user) => ' ' + user)}</h4>
      </div>
    );
  };
  //define arrow function in the class
  increment = () => {
    this.setState({
      users: [...this.state.users, 'Aditi'],
      clr: 'blue',
      counter: this.state.counter + 1,
    });
  };
}
