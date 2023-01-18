import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import EmpDetails from './components/EmpDetails';
import CounterComponent from './components/CounterComponent';
import DisplayMessage from './components/DisplayMessage';
function App() {
  var n=23;
  return (
    <div>
         <DisplayMessage></DisplayMessage>
         <CounterComponent></CounterComponent>
         <Header name="Rajan" num={n}></Header>
         <EmpDetails name="Revati" desg="designer"></EmpDetails> 
         <h1>Hello world!!</h1>
    </div>
  );
}

export default App;
