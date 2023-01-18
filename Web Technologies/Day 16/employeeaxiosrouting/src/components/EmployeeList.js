import { useEffect, useState} from "react";
import EmployeeService from './EmployeeService';
const EmployeeList=()=>{
    let [emparr,setemparr] =useState([]);
    //initialization data
    useEffect(()=>{
     EmployeeService.getEmployees().
     then((response)=>{
        console.log("in useffect of emplist initialization");
        console.log(response.data);
        setemparr(response.data);
     })

    },[]); 
    const renderList=()=>{
        return emparr.map((emp)=>{
            return <tr key={emp.empid}><td>{emp.empid}</td><td>{emp.ename}</td><td>{emp.sal}</td></tr>
        });
    }
    return(
        <div>
        <button type="button" name="btn" id="btn" className="btn btn-primary">Add Employee</button>
        <table border="2"><thead>
        <tr><th>Employee ID</th><th>Name</th><th>sal</th></tr>
        </thead>
        <tbody>
            {renderList()}
        </tbody>
        </table>
        </div>
    )
}

export default EmployeeList;