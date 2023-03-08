import React, { Component } from 'react';
import PropTypes from 'prop-types';
import './Counter.css';
import CounterButton from './CounterButton';

//parent component of CounterButton child component
export default class Counter3 extends Component {
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
    this.resetCounter = this.resetCounter.bind(this);
  }

  render() {
    return (
      <div>
        <CounterButton incBy={1} incMethod={this.increment} />
        <CounterButton incBy={3} incMethod={this.increment} />
        <CounterButton incBy={5} incMethod={this.increment} />
        <CounterButton incBy={-1} incMethod={this.increment} />
        <CounterButton incBy={0} incMethod={this.resetCounter} />
        <span className='count'>{this.state.counter}</span>
      </div>
    );
  }

  increment(incBy) {
    // this.setState({
    //   counter: this.state.counter + incBy,
    // });
    //another way to call setState : by passing arrow func to setState
    //, with arg of  prev state : if required
    //n MUST return a JS object with new state (atually it's a new state merged into prev state)
    //
    this.setState((prevState) => {
      return { counter: prevState.counter + incBy };
    });
    console.log(`parent inc ${this.state.counter}`);
  }
  //reset counter
  resetCounter() {
    console.log(`parent : reset `);
    //since here just wanted reset the counter : this is easier way
    //passing to setState a JS object with state
    this.setState({ counter: 0 });
  }
}

//assigning a def value of the props
Counter3.defaultProps = {
  incBy: 3,
};
//specifying the props type
Counter3.propTypes = {
  incBy: PropTypes.number,
};
