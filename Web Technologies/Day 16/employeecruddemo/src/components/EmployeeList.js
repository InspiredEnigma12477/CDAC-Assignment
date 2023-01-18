import EmployeeCard from './EmployeeCard';
import EmployeeEdit from './EmployeeEdit';
import {useState} from 'react';

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
    const renderList=()=>props.employees.map((emp,index)=>{
        return <EmployeeCard key={emp.empid} employee={emp} removeEmp={deleteData} editEmeployee={changeEmployee}></EmployeeCard>
    });
    const modifyData=(ob)=>{
        props.updateEmp(ob);
        setflag(false);
    }
    return(
        <div>
        <div>
            <h1>In employeeList component</h1>
            {renderList()}
        </div>
        {displayFlag?(<div>
           <EmployeeEdit  employee={empob} modifyEmp={modifyData}></EmployeeEdit>
        </div>):""};
        
        </div>
    )
}
export default EmployeeList;