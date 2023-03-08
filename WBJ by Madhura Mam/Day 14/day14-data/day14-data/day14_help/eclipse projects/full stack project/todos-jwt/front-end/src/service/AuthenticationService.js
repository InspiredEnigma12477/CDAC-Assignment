import axios from 'axios';
class AuthenticationService {
  authenticateUser(userName, pwd) {
    //make api call for auth
    console.log('auth call', userName, pwd);
    return axios.post('http://localhost:8080/api/signin', {
      userName: userName,
      password: pwd,
    });
  }
  // getBasicAuthToken(userName, password) {
  //   return 'Basic ' + window.btoa(userName + ':' + password);
  // }
  storeUserDetails(userName, jwt) {
    // console.log('add user');
    //since user has logged in : now for every request to the backend : add req auth interceptor
    this.setupRequestInterceptor(jwt);
    //user has logged in successfully : so add it's details under session storage
    sessionStorage.setItem('user_dtls', userName);
  }
  removeUserDetails() {
    console.log('rem user');
    sessionStorage.removeItem('user_dtls');
  }
  isUserLoggedIn() {
    console.log('chk user');
    return sessionStorage.getItem('user_dtls') === null ? false : true;
  }
  getUserName() {
    return sessionStorage.getItem('user_dtls');
  }

  //set up axios request interceptor for JWT
  setupRequestInterceptor(jwt) {
    //  const basicAuth = 'Basic ' + window.btoa(userName + ':' + password);

    axios.interceptors.request.use((config) => {
      if (this.isUserLoggedIn()) {
        //adding the authorization header to config
        config.headers.authorization = 'Bearer ' + jwt;
      }
      //return config
      return config;
    });
  }
}
//export it's instance , so that it's methods can be called from components
export default new AuthenticationService();
