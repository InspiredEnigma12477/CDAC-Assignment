import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import WelcomeComponent from './components/todo/WelcomeComponent';
import LoginComponent from './components/todo/LoginComponent';
import ErrorComponent from './components/todo/ErrorComponent';
import ListToDosComponent from './components/todo/ListToDosComponent';
import FooterComponent from './components/todo/FooterComponent';
import HeaderComponent from './components/todo/HeaderComponent';
import LogOutComponent from './components/todo/LogOutComponent';
import AuthenticatedRoute from './components/todo/AuthenticatedRoute';
import ToDoComponent from './components/todo/ToDoComponent';

function App() {
  return (
    <div className='App'>
      <Router>
        <HeaderComponent />
        <Switch>
          <Route exact path='/' component={LoginComponent} />
          <AuthenticatedRoute
            exact
            path='/welcome/:name'
            component={WelcomeComponent}
          />
          <AuthenticatedRoute
            exact
            path='/todos/:id'
            component={ToDoComponent}
          />
          <Route exact path='/login' component={LoginComponent} />
          <AuthenticatedRoute
            exact
            path='/todos'
            component={ListToDosComponent}
          />
          <AuthenticatedRoute
            exact
            path='/logout'
            component={LogOutComponent}
          />
          <Route component={ErrorComponent}></Route>
        </Switch>
        <FooterComponent />
      </Router>
    </div>
  );
}

export default App;
