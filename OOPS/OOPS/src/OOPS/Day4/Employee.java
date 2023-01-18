package OOPS.Day4;
/*
*
3. Solve this.
Fresh business scenario to apply inheritance , polymorphism n abstraction to emp based organization scenario.

Create Emp based organization structure --- Emp , Mgr , Worker
All of above classes must be in --com.app.org

3.1 Emp state--- id(int), firstName, lastName , deptId , basic(double)
emp id MUST be automatically generated.

Behaviour ---1.  get emp details -- using  toString.

2. compute net salary

3.2 Mgr state  ---id,name,basic,deptId , perfBonus
Behaviour ----1. get mgr details :  using toString.
2. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
3. get performance bonus. --add a new method to return bonus.(getter)

*/

import java.util.Scanner;

public class Employee {
    private int id, deptId;
    private String firstName, lastName;
    private double basic, netSalary;

    Scanner sc = new Scanner(System.in);

    public void AcceptInfo(){
        System.out.println("Enter the ID: ");
        id = sc.nextInt();
        System.out.println("Enter the Full Name: ");
        firstName = sc.next();
        lastName = sc.next();
        System.out.println("Enter the basic: ");
        basic = sc.nextDouble();
        System.out.println("Enter the Department ID: ");
        deptId = sc.nextInt();

        netSalary();
    }

    public String toString(){
        return " Employee[ ID: " + id + " Full Name: " + firstName +" "+ lastName + " Basic: " + basic + " deptID: " + deptId + "]";
    }
    private void netSalary(){
        netSalary = basic;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.AcceptInfo();
        System.out.println(e);
    }
}

