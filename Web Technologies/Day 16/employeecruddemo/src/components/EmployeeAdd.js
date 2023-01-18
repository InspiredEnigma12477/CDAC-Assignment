
import {useState} from 'react';
const EmployeeAdd=(props)=>{
    let [empob,setEmpOb]=useState({empid:"",ename:"",sal:""});
    const handleChange=(event)=>{
        console.log("in handle change");
        const {name,value} =event.target
        setEmpOb({...empob,[name]:value})

    }
    // to send the data from form to app.js to add in the array
    const addData=(event)=>{
         event.preventDefault();  /// to stop the page refresh action of submit button
         if(empob.empid==="" || empob.ename==="" || empob.sal===""){
            alert("pls fill all values");
            return;
         }
         //send data to parent for adding in the array
         props.addEmployee(empob);
         //to clear the textboxes in the form
         setEmpOb({empid:"",ename:"",sal:""});

    }
    return(
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
            <button type="button" class="btn btn-primary" onClick={addData}>Add Employee</button>
        </form>
        </div>
    )
}
export default EmployeeAdd;