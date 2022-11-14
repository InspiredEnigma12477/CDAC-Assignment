public class Main {
    public static void main(String[] args) {
       
        Stack<Employee> stackE = new Stack<Employee>(4);
        stackE.push(new Employee());
        stackE.push(new Employee(10,"Novel"));
        stackE.push(new Employee(100,"Marvel"));
        Employee e = stackE.pop();
        e.display();
        e = stackE.pop();
        e.display();
        e = stackE.pop();
        e.display();
        
        // Home work
        // Create stack of book names
        Stack<String> myStrings = new Stack<>(3);
        myStrings.push("Data Structures");
        myStrings.push("JAVA");
        myStrings.push("COP");
        
        System.out.println(myStrings.pop());
        System.out.println(myStrings.pop());
        System.out.println(myStrings.pop());
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}
