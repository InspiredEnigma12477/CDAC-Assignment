import EmployeeCard from './EmployeeCard';
import EmployeeEdit from './EmployeeEdit';
import {useState} from 'react';
import {Link} from 'react-router-dom';

const EmployeeList=(props)=>{
    let [displayFlag,setflag]=useState(false);
    let [empob,setempob] =useState({empid:"",ename:"",sal:""});
     const changeEmployee=(ob)=>{
        setflag(true);
        console.log(ob);
        setempob({...ob});

     }
    const deleteData=(id)=>{
   
            props.removeData(id);
    }
    const modifyData=(ob)=>{
        props.updateEmp(ob);
        setflag(false);
    } 
    const renderList=()=>props.employees.map((emp,index)=>{
        return <EmployeeCard key={emp.empid} employee={emp} removeEmp={deleteData} editEmeployee={changeEmployee}></EmployeeCard>
    });
    
    return(
        <div>

        <div>
            <h1>In employeeList component</h1>
            <Link to="/addemp">
                <div>
                    <button className="btn btn-success" type="button" name="btn" id="btn">Add new Employee</button>
                </div>
            </Link>
            {renderList()}
        </div>
        
        
        </div>
    )
}
export default EmployeeList;