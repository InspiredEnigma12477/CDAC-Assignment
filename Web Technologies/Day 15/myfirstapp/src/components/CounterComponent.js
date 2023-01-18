import React,{Component} from 'react';
class CounterComponent extends React.Component{
    constructor(props){
        super(props);
        this.state={
            count:0
        }
    }
    incrementcounter=()=>{
        alert("in increament");
        this.setState({count:this.state.count+1})
    };
    render(){
        return(
            <div>
                {/* <button type="button" name="btn" id="btn" value="btn" onClick={(event)=>{this.incrementcounter(event)}}>Click counter</button> */}
                <button type="button" name="btn" id="btn" value="btn" onClick={this.incrementcounter}>Click counter</button>
                {this.state.count>0?<h4> you clicked {this.state.count} times</h4>:""}
            </div>
       )
    }

}

export default CounterComponent;