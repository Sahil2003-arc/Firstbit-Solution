package assignment;

class DemoAd{
	int id;
	String name;
	int salary;
	int allowance;
	
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
	void setSalary(int salary) {
		this.salary = salary;
	}
	int getAllowance() {
		return allowance;
	}
	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
//	void display() {
//		System.out.println("The id is"+this.id);
//		System.out.println("Name is "+this.name);
//		System.out.println("salary is"+this.salary);
//		System.out.println("allowance is"+this.allowance);
//	}
	
	DemoAd(){//default constructor
		this.id=0;
		this.name="null";
		this.salary=98;
		this.allowance=50;	
	}
	public DemoAd(int id, String name, int salary, int allowance) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.salary+" "+this.allowance;
		
	}
	
	
	
}
public class AdminDemo {

	public static void main(String[] args) {
		
		DemoAd a1=new DemoAd(101,"Sahil",20000,20);
		DemoAd a2=new DemoAd(102,"pooja",100,10);
		System.out.println(a1+" "+a2);
		System.out.println(a1.toString());
		
		
		
		

		
		
		

	}

}