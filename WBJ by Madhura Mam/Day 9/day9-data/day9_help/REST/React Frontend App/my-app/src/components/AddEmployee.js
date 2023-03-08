//import axios from 'axios';
import { useState } from 'react';
import { Link, useHistory, useParams } from 'react-router-dom';
import { useEffect } from 'react/cjs/react.development';
import employeeService from '../services/employee.service';

const AddEmployee = () => {
  const [firstName, setFirstname] = useState('');
  const [lastName, setLastname] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [salary, setSalary] = useState('');
  const [joinDate, setJoindate] = useState('');
  const [location, setLocation] = useState('');
  const [department, setDepartment] = useState('');

  const history = useHistory();
  const { id } = useParams();

  const saveEmployee = (e) => {
    e.preventDefault();

    const employee = {
      firstName,
      lastName,
      email,
      password,
      joinDate,
      location,
      department,
      id,
      salary,
    };
    if (id) {
      //update
      employeeService
        .update(employee)
        .then((response) => {
          console.log('Employee data updated successfully', response.data);
          history.push('/');
        })
        .catch((error) => {
          alert(error.response.status);
          console.log('Error code ' + error);
          console.log('Something went wrong', error.response.data);
        });
    } else {
      //create
      employeeService
        .create(employee)
        .then((response) => {
          console.log('employee added successfully', response.data);
          history.push('/');
        })
        .catch((error) => {
          console.log('something went wroing' + error.response);
        });
    }
  };

  useEffect(() => {
    if (id) {
      employeeService
        .get(id)
        .then((employee) => {
          setFirstname(employee.data.firstName);
          setLastname(employee.data.lastName);
          setEmail(employee.data.email);
          setPassword(employee.data.password);
          setJoindate(employee.data.joinDate);
          setSalary(employee.data.salary);
          setLocation(employee.data.location);
          setDepartment(employee.data.department);
        })
        .catch((error) => {
          console.log('Something went wrong', error);
        });
    }
  }, []);
  return (
    <div className='container'>
      <h3>Add Employee</h3>
      <hr />
      <form>
        <div className='form-group'>
          <input
            type='text'
            className='form-control col-4'
            id='firstName'
            value={firstName}
            onChange={(e) => setFirstname(e.target.value)}
            placeholder='Enter first name'
          />
        </div>
        <div className='form-group'>
          <input
            type='text'
            className='form-control col-4'
            id='lastName'
            value={lastName}
            onChange={(e) => setLastname(e.target.value)}
            placeholder='Enter last name'
          />
        </div>
        <div className='form-group'>
          <input
            type='text'
            className='form-control col-4'
            id='email'
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            placeholder='Enter email'
          />
        </div>
        <div className='form-group'>
          <input
            type='password'
            className='form-control col-4'
            id='password'
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            placeholder='Enter Password'
          />
        </div>
        <div className='form-group'>
          <input
            type='text'
            className='form-control col-4'
            id='department'
            value={department}
            onChange={(e) => setDepartment(e.target.value)}
            placeholder='Enter Department'
          />
        </div>
        <div className='form-group'>
          <input
            type='text'
            className='form-control col-4'
            id='location'
            value={location}
            onChange={(e) => setLocation(e.target.value)}
            placeholder='Enter Location'
          />
        </div>
        <div className='form-group'>
          <input
            type='text'
            className='form-control col-4'
            id='sal'
            value={salary}
            onChange={(e) => setSalary(e.target.value)}
            placeholder='Enter salary'
          />
        </div>
        <div className='form-group'>
          <input
            type='date'
            className='form-control col-4'
            id='joinDate'
            value={joinDate}
            onChange={(e) => setJoindate(e.target.value)}
            placeholder='Enter Joining date'
          />
        </div>
        <div>
          <button onClick={(e) => saveEmployee(e)} className='btn btn-primary'>
            Save Or Update
          </button>
        </div>
      </form>
      <hr />
      <Link to='/'>Back to List</Link>
    </div>
  );
};

export default AddEmployee;
