import React, { Component } from 'react';
import PropTypes from 'prop-types';
import './Counter.css';

export default class Counter2 extends Component {
  //step 1 : add a constr to init the state of the component
  constructor() {
    super(); //must invoke super before initing the state of the comp
    //init the state : as JS object with properties (eg : counter)
    this.state = {
      counter: 0,
    };
    //bind increment method to the class
    /*For a given increment function, creates a bound function 
    that has the same body as the original function. 
    The 'this' object of the bound function is associated with the 
    specified object, and has the specified initial parameters.
     */
    this.increment = this.increment.bind(this);
  }
  //render method replaced by the arrow function
  render() {
    return (
      <div>
        <h3>Counter 2</h3>
        <button onClick={this.increment}>{this.props.incBy}</button>
        <span className='count'>{this.state.counter}</span>
      </div>
    );
  }
  //define arrow function in the class
  increment() {
    this.setState({
      counter: this.state.counter + this.props.incBy,
    });
    console.log(this.state.counter);
  }
}
//assigning a def value of the props
Counter2.defaultProps = {
  incBy: 3,
};
//specifying the props type
Counter2.propTypes = {
  incBy: PropTypes.number,
};
