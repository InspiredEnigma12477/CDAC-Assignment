import {useState} from 'react';

const EmployeeAdd=(props)=>{
    let [empob,setempob]=useState({empid:"",ename:"",sal:""});

    const handleChange=(event)=>{
        //let name=event.target.name;
        //let value=event.target.value;
        //target name property will be assigned to name valriable
        //target value property to value variable
        let {name,value}=event.target;
        setempob({...empob,[name]:value})
    };
    const addData=()=>{
        if(empob.empid==="" || empob.ename==="" || empob.sal===""){
            alert("pls add all the values in the form")
            return;
        }
        props.addEmployee(empob);
        setempob({empid:"",ename:"",sal:""})
    }
    /* const changeempid=(event)=>{
        let name=event.target.name;
         setempob({...empob,empid:event.target.value})
    }

    const changeename=(event)=>{
        let name=event.target.name;
        setempob({...empob,ename:event.target.value})
   }
   const changeSal=(event)=>{
    let name=event.target.name;
    setempob({...empob,sal:event.target.value})
} */
    return(
        <form>
  <div className="form-group">
    <label htmlFor="empid">Employee Id</label>
    <input type="text" className="form-control" id="empid" name="empid"
    value={empob.empid}
    onChange={handleChange}
    placeholder="enter empid"/>
    
  </div>
  <div className="form-group">
    <label htmlFor="ename">Employee Name</label>
    <input type="text" className="form-control" id="ename" name="ename" 
    value={empob.ename}
    onChange={handleChange}
    placeholder="enter name"/>
  </div>
  <div className="form-group">
    <label htmlFor="sal">Employee Salary</label>
    <input type="text" className="form-control" id="sal" name="sal" 
    value={empob.sal}
    onChange={handleChange}
    placeholder="enter salary"/>
  </div>
  <button type="button" className="btn btn-primary" onClick={addData}>Add Employee</button>
</form>
    )

}

export default EmployeeAdd;