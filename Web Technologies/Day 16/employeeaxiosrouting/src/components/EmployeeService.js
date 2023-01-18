import axios from 'axios';

class EmployeeService{
    constructor(){
        this.baseUrl="http://localhost:4000/";
   }
    getEmployees(){
        return axios.get(this.baseUrl+"employee");
    }

}

export default new EmployeeService();