package assignment;

abstract class Employee {
    int id;
    String name;
    double salary;

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    Employee() {
        this.id = 100;
        this.name = "not given";
        this.salary = 1000;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}

class Admin extends Employee {
    double allowance;

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    Admin() {
        super();
        this.allowance = 0;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void display() {
        super.display();
        System.out.println("Allowance: " + this.allowance);
    }
}

class SalesManager extends Employee {
    double incentive;
    int target;

    double getIncentive() {
        return incentive;
    }

    void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    int getTarget() {
        return target;
    }

    void setTarget(int target) {
        this.target = target;
    }

    SalesManager() {
        super();
        this.incentive = 0;
        this.target = 0;
    }

    SalesManager(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void display() {
        super.display();
        System.out.println("Incentive: " + this.incentive);
        System.out.println("Target: " + this.target);
    }
}

class HR extends Employee {
    double commission;

    double getCommission() {
        return commission;
    }

    void setCommission(double commission) {
        this.commission = commission;
    }

    HR() {
        super();
        this.commission = 0;
    }

    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    void display() {
        super.display();
        System.out.println("Commission: " + this.commission);
    }
}

public class Empdemo {
    public static void main(String[] args) {
    	Employee e1;
//        Employee e1 = new Employee();
//        e1.display();
//
//        Employee e2 = new Employee(101, "Sahil", 2000.0);
//        e2.display();

        Admin a1 = new Admin();
        a1.display();

        Admin a2 = new Admin(102, "Pooja", 1000.0, 34000);
        a2.display();

        SalesManager s1 = new SalesManager();
        s1.display();

        SalesManager s2 = new SalesManager(103, "Mansi", 3000.0, 39000, 500);
        s2.display();

        HR h1 = new HR();
        h1.display();

        HR h2 = new HR(104, "Akki", 20000, 5000);
        h2.display();
    }
}
