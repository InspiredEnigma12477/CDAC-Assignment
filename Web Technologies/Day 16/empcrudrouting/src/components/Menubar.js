import {Link} from 'react-router-dom';

const MenuBar=()=>{
return (
    <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <Link to="/list">
             <a class="navbar-brand" href="#">List</a>
        </Link>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
      <Link to="/addemp">
        <a class="nav-link" href="#">add <span class="sr-only">(current)</span></a>
        </Link>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Features</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled">Disabled</a>
      </li>
    </ul>
  </div>
</nav>
    </div>

);
}
export default MenuBar;