import React,{Component} from 'react';
class CounterComponent extends React.Component{
    incrementcounter=()=>{
        alert("in increament");
    };
    render(){
        return(
            <div>
                <button type="button" name="btn" id="btn" value="btn" onClick={this.incrementcounter}>Click counter</button>
                {/* <h4> you clicked {counter} times</h4> */}
            </div>
       )
    }

}

export default CounterComponent;