import React, { Component } from 'react';

export default class CounterButton extends Component {
  constructor() {
    super();
    //   this.incrementChild = this.incrementChild.bind(this);
  }
  render() {
    return (
      <div>
        {/* passing arrow func in click handler : since wanted to call a method incMethod with arg */}
        <button onClick={() => this.props.incMethod(this.props.incBy)}>
          {this.props.incBy}
        </button>
      </div>
    );
  }
  //   incrementChild() {
  //     console.log('in child inc ', this.props.incBy);
  //     this.props.incMethod(this.props.incBy);
  //   }
}
