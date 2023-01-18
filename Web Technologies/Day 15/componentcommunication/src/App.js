import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import ParentComponent from './component/ParentComponent';

function App() {
  return (
    <div>
      <div id="mydiv">Hello World!!</div>
      <button type="button" name="btn" className="btn btn-success" id="btn">test button</button>
      <ParentComponent></ParentComponent>
    </div>
  );
}

export default App;
