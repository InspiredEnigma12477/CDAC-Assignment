import ChildComponent from "./ChildComponent";

const ParentComponent=function(){
    var ob={name:"Rajas",desg:"Manager"};
    const receivedata=(data)=>{
        console.log("in parent receiveData")
         alert(data);
         console.log(data);
    }
    return(
        <div>
            <div>parent component</div>
            <hr></hr>
            <ChildComponent name={ob.name} desg={ob.desg} getName={receivedata}></ChildComponent>
        </div>
    );

}
export default ParentComponent