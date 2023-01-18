import logo from './logo.svg';
import './App.css';
import EmployeeList from './components/EmployeeList';
import {useState} from 'react';

function App() {
  let [emparr,setemparr]=useState([{empid:"11",ename:"Rajan",sal:"1234"},
  {empid:"12",ename:"Revati",sal:"44444"}
])
  return (
    <div>
      <EmployeeList  employees={emparr}></EmployeeList> 
    </div>
  );
}

export default App;
