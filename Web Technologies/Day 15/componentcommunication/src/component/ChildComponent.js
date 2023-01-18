import {useState} from 'react';

const ChildComponent=function(props){
    let [name,setname]=useState("Kishori");
    
    const handleChange=(event)=>{
     //let {name,value}=event.target;
     setname(event.target.value);
    }
    const sendData=()=>{
        console.log("in child sendData")
       props.getName(name); 
    }
    return(
        <div>
            <h1>in child component</h1>
            <h2> from parent {props.name}   {props.desg}</h2>
            <input type="text" name="name" id="nm" 
            value={name}
            onChange={(event)=>handleChange(event)}></input>
            <button type="button" name="btn" id="btn" onClick={sendData}>pass data to parent</button>

        </div>
    )
}

export default ChildComponent;