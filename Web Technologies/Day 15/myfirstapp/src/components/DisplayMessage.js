import React,{Component} from 'react'
class DisplayMessage extends React.Component{
    constructor(props){
        super(props);
        console.log("in constructor function of DisplayMessage");
        this.state={
            displayFlag:false
        }
        //this line is nneded to pass this object if function is not defined by
        //using arrow operator
        //this.changeflag=this.changeflag.bind(this);
    }
    changeflag=()=>{
        this.setState({displayFlag:!this.state.displayFlag})
    }
    render(){
        console.log("in render function of DisplayMessage");
        return (<div>
            {this.state.displayFlag?(<div>
                    <p>This is para</p>
                    <button type="button" name="btn" id="btn" onClick={this.changeflag}>hide</button>
            </div>):
            (<div>
               <button type="button" name="btn" id="btn" onClick={this.changeflag}>show</button>
            </div>)}
       </div>)
    }
}

export default DisplayMessage;