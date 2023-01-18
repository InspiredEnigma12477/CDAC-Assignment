import EmployeeCard from './EmployeeCard';
import EmployeeEdit from './EmployeeEdit';
import {useState} from 'react';

const EmployeeList=(props)=>{
    let [displayFlag,setflag]=useState(false);
     const changeEmployee=(ob)=>{
        setflag(true);
        console.log(ob);

     }
    const deleteData=(id)=>{
        props.removeData(id);
    }
    const renderList=()=>props.employees.map((emp,index)=>{
        return <EmployeeCard key={emp.empid} employee={emp} removeEmp={deleteData} editEmeployee={changeEmployee}></EmployeeCard>
    });
    return(
        <div>
        <div>
            <h1>In employeeList component</h1>
            {renderList()}
        </div>
        {displayFlag?(<div>
           <EmployeeEdit ></EmployeeEdit>
        </div>):""};
        
        </div>
    )
}
export default EmployeeList;