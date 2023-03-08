import { Route, Redirect } from 'react-router-dom';
import AuthenticationService from '../../service/AuthenticationService';

export default function AuthenticatedRoute(props) {
  if (AuthenticationService.isUserLoggedIn()) {
    return <Route {...props} />;
  } else {
    return <Redirect to='/login' />;
  }
}
