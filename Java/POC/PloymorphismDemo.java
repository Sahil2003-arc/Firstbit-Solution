package assignment;

abstract class Emp {
    int id;
    String name;
    double salary;
    double calsal;

  abstract double getCalsal(); 
//    {
//		return calsal;
//	}

	void setCalsal(double calsal) {
		this.calsal=calsal;
	}

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

    Emp() {
        this.id = 100;
        this.name = "not given";
        this.salary = 1000;
    }

    Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
    
    abstract double calsal(); 
    	
    
}

class Ad extends Emp {
    double allowance;

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    Ad() {
        super();
        this.allowance = 0;
    }

    Ad(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void display() {
        super.display();
        System.out.println("Allowance: " + this.allowance);
    }
    
    double calsal()
    {
    	return salary+allowance;
    }
}

class salesManager extends Emp {
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

    salesManager() {
        super();
        this.incentive = 0;
        this.target = 0;
    }

    salesManager(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void display() {
        super.display();
        System.out.println("Incentive: " + this.incentive);
        System.out.println("Target: " + this.target);
    }
    
    double calsal() {
    	return salary+incentive+target;
    }
}

class hr extends Employee {
    double commission;

    double getCommission() {
        return commission;
    }

    void setCommission(double commission) {
        this.commission = commission;
    }

    hr() {
        super();
        this.commission = 0;
    }

    hr(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    void display() {
        super.display();
        System.out.println("Commission: " + this.commission);
    }
    
    double calsal() {
    	return salary+commission;
    }
}

public class PloymorphismDemo {

	public static void main(String[] args) {
		Emp e1;
//		e1=new Emp(101,"Sahil",5000);
//		e1.display();
//		System.out.println("Total salary:"+e1.calsal);
	    
		e1=new Ad(102,"pooja",4000,5000);
		e1.display();
		System.out.println("Total salary:"+e1.calsal);

		
		

		
		
	}

}
