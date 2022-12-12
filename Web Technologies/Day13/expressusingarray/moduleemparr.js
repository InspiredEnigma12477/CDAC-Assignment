var emp=[{id:1,name:"Rajan",desg:"designer"},
{id:2,name:"Revati",desg:"ux designer"},
{id:3,name:"Atharva",desg:"UI developer"}];

exports.isertEmp=function(ob){
    emp.push(ob);
}

exports.getlength=function(){
    return emp.length;
}
exports.searchEmp=function(id){
    for(var empob of emp){
        if(empob.id===parseInt(id)){
            return empob;
        }
    }
    return null;
}