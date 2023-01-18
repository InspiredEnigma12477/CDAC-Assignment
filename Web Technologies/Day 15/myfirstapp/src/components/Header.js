const Header=(props)=>{
    let name="Kishori"
    console.log(props);
    return(
          <div>
               <h1>In header component {name}   {props.name}  {props.num}</h1>
         </div>
    )
 }

 export default Header;
 