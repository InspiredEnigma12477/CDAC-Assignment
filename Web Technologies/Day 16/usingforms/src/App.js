import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import EmployeeAdd from './components/EmployeeAdd';
import {useState} from 'react';
function App() {
  let [emparr,setemparr]=useState([{empid:1,ename:"kishori",sal:"23456"}])
  const insertEmp=(ob)=>{
      let newarr=[...emparr,{...ob}];
      setemparr(newarr);
  }
  const rendernames=()=>{
    return emparr.map((emp)=>{
      return <li key={emp.empid}>{emp.ename}</li>
    })
  }
  return (
    <div>
       <EmployeeAdd   addEmployee={insertEmp}></EmployeeAdd>
       {/* <EmployeList employess={emparr}></EmployeList> */}
       <ul>
        {rendernames()}
       </ul> 
    </div>
  );
}

export default App;
