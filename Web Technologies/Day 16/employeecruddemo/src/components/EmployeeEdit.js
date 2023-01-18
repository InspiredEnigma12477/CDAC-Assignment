import {useState} from 'react';

const EmployeeEdit=(props)=>{
    let [empob,setempob]=useState(props.employee);
    const handleChange=(event)=>{
        console.log("in handle change");
        const {name,value} =event.target
        setempob({...empob,[name]:value})

    }
    const updateEmployee=()=>{
        props.modifyEmp(empob);
        setempob({empid:"",ename:"",sal:""});
    }
    return (
        <div>
        <form>
            <div class="form-group">
                <label for="empid">Employee Id</label>
                <input type="text" class="form-control" id="empid" name="empid"
                value={empob.empid} 
                onChange={handleChange}
                placeholder="enter empid"/>
                
            </div>
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" name="ename" 
                value={empob.ename} 
                onChange={handleChange}
                placeholder="enter name"/>
            </div>
            <div class="form-group">
                <label for="sal">Salary</label>
                <input type="text" class="form-control" id="sal" name="sal" 
                value={empob.sal} 
                onChange={handleChange} placeholder="enter salary"/>
            </div>
            <button type="button" class="btn btn-primary" onClick={updateEmployee}>Update Employee</button>
        </form>
        </div>
    )

}

export default EmployeeEdit;