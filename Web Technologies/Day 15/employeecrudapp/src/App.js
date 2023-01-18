import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import EmployeeAdd from './components/EmployeeAdd';
import EmployeeList from './components/EmployeeList';
import Header from './components/Header';
import {useState} from 'react';

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
     setemparr([...emparr,{...ob}]);

  }
  const deleteemeployee=(id)=>{
    ///find all objects whose id is not matching
    let newarr=emparr.filter(ob=>ob.empid!==id);
    //overwrite emparr with newarr
    setemparr(newarr);
  }
  return (
    <div>
      {/* <h1>Hello World!!</h1>
      <button type="button" name="btn" id="btn" className="btn btn-primary">test</button> */}
      <Header></Header>
      <div className="container">
      <div className="row">
         <div className="col-sm-12 col-md-6">
         <EmployeeAdd addEmployee={insertData}></EmployeeAdd>
         </div>
         <div className="col-sm-12 col-md-6">
            <EmployeeList employees={emparr} removeData={deleteemeployee}></EmployeeList>
         </div>
      </div>

      </div>
      
      
    </div>
  );
}

export default App;
