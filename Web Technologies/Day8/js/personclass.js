class Person{
    constructor(id,name,mob){
        this.id=id;
        this.name=name;
        this.mob=mob;
    }
    display(){
      document.write(`id :${this.id} name: ${this.name} mob: ${this.mob}`)  
    }
}

class Employee extends Person{
    constructor(id,name,mob,dept,desg){
       super(id,name,mob);
       this.dept=dept;
       this.desg=desg;
    }
    display(){
        super.display();
      document.write(`dept :${this.dept} desg: ${this.desg} `);

    }


}