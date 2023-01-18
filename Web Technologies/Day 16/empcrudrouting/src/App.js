import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import EmployeeAdd from './components/EmployeeAdd';
import EmployeeList from './components/EmployeeList';
import EmployeeEdit from './components/EmployeeEdit';
import Header from './components/Header';
import {useState} from 'react';
import {BrowserRouter as Router,Route,Switch,Redirect} from 'react-router-dom';
import MenuBar from './components/Menubar';

function App() {
  /*let emparr=[
    {empid:"12",ename:"Rajan",sal:"34567"},
    {empid:"13",ename:"Revati",sal:"345555"},
    {empid:"14",ename:"anagha",sal:"55555"},
    {empid:"15",ename:"Anajali",sal:"44444"}
  ];*/
  let [emparr,setemparr]=useState([
    {empid:"12",ename:"Rajan",sal:"34567"},
    {empid:"13",ename:"Revati",sal:"345555"},
    {empid:"14",ename:"anagha",sal:"55555"},
    {empid:"15",ename:"Anajali",sal:"44444"}
  ])

  const insertData=(ob)=>{
    //add ob object in the array
     setemparr([...emparr,{...ob}]);

  }
  const deleteemeployee=(id)=>{
    ///find all objects whose id is not matching
    let newarr=emparr.filter(ob=>ob.empid!==id);
    //overwrite emparr with newarr
    setemparr(newarr);
  }
  const editData=(ob)=>{
      let newarr= emparr.map(emp=>emp.empid===ob.empid?{...ob}:{...emp});

      //{...ob} -=> {empid:ob.empid,ename:ob.ename,sal:ob.sal}
      setemparr(newarr);
  }
 
  return (
<div>
<Router>
   <MenuBar></MenuBar>
  <Switch>
    <Route path="/" exact render={(props)=>(<EmployeeList {...props} 
    employees={emparr} 
    removeData={deleteemeployee} updateEmp={editData}></EmployeeList>)}></Route>
    <Route path="/list" exact
    render={(props)=>
    (<EmployeeList {...props} 
    employees={emparr} 
    removeData={deleteemeployee} updateEmp={editData}></EmployeeList>)}></Route>
    <Route path="/addemp" render={(props)=>(<EmployeeAdd {...props} addEmployee={insertData}></EmployeeAdd>)}></Route>
    <Route path="/edit/:empid" render={(props)=>(<EmployeeEdit modifyEmp={editData}></EmployeeEdit>)}></Route>
  </Switch>
</Router>
</div>
  );
}

export default App;
