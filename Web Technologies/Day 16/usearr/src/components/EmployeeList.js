const EmployeeList=function(props){
    console.log(props);
    const renderList=()=>{
       return  props.employees.map(emp=>{
            return <tr key={emp.empid}><td>{emp.empid}</td><td>{emp.ename}</td><td>{emp.sal}</td></tr>;
        });
    }
    return(
        <div>
        <table border="2">
        <tr><th>Id</th><th>name</th><th>salary</th></tr>
           {renderList()}
        </table>
        </div>
    );

}

export default EmployeeList;