import React,{ Component } from "react";

class EmpDetails extends React.Component{
    constructor(props){
        super(props);
        this.state={id:12,arr:[1,2,3,4,5]}
    }
    render(){
        return (
        <div>
              {this.props.name}----- {this.props.desg}
              {this.state.id}-------{this.state.arr[2]}
             <h1>In empdetails</h1>
        </div>);
    }
}

export default EmpDetails;