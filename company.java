
import java.util.*;

class Employee {

    String name;
    int employeeid;
    double basicsalary;
    double travelallowance;
    double hra;
    double da;
    double totalsalary;

    public void employee(String name, int employeeid, double basicsalary) {
        this.name = name;
        this.employeeid = employeeid;
        this.basicsalary = basicsalary;

    }

    public void calculateallowance() {
        this.travelallowance = 0.10 * basicsalary;
        this.da = 0.20 * basicsalary;
        this.hra = 0.50 * basicsalary;

        this.totalsalary = basicsalary + travelallowance + da + hra;

    }

    public void displayEmployee() {
        System.out.println("naam:" + name);
        System.out.println("employee id : " + employeeid);
        System.out.println("aapki salary : " + basicsalary);
        System.out.println("your  hra is :" + hra);
        System.out.println("your da is :" + da);
        System.out.println("your travelling allowance is :" + travelallowance);
        System.out.println("apni total salary btao : " + totalsalary);

    }

}

public class company {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee name");
        String name = sc.nextLine();
        System.out.println("apni id likho ");
        int employeeid = sc.nextInt();
        System.out.println("apni salary likho");
        double basicsalary = sc.nextDouble();
        Employee ob = new Employee();
        ob.employee(name, employeeid, basicsalary);
        ob.calculateallowance();
        ob.displayEmployee();

    }

}
