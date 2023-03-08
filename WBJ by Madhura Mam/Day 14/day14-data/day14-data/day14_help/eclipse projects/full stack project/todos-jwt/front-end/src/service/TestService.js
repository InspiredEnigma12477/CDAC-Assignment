import axios from 'axios';
class TestService {
  getMessageFromAPI(userName) {
    //adding basic auth header
    //  const password = '1234';
    //  const basicAuth = 'Basic ' + window.btoa(userName + ':' + password);
    //console.log('msg api ', userName, password, basicAuth);
    // return axios.get(`http://localhost:8080/api/test/${userName}`, {
    //   headers: {
    //     authorization: basicAuth,
    //   },
    //  });
    return axios.get(`http://localhost:8080/api/test/${userName}`);
  }
}
export default new TestService();
