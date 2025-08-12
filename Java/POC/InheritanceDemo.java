package assignment;

class Student{
	int fid,dist;
	String name;
	
	 int getFid() {
		return fid;
	}
	 void setFid(int fid) {
		this.fid = fid;
	}
	 int getDist() {
		return dist;
	}
	 void setDist(int dist) {
		this.dist = dist;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	
	Student(){
		this.fid=100;
		this.name="Not given";
		this.dist=0;
	}
	Student(int i,String nm,int d){
		this.fid=i;
		this.name=nm;
		this.dist=d;
	}
	
	void display() {
		System.out.println("Fid is:"+this.fid);
		System.out.println("Name is:"+this.name);
		System.out.println("Distance is:"+this.dist);
	}
}   // class student ends here


class PlacedStudent extends Student
{
	String cName,des;
      public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	  PlacedStudent(){
		  super();
    	  this.cName="Not given";
    	  this.des="not mentioned";
      }
	
	  PlacedStudent(int i,String nm,int d,String c,String de){
		  super(i,nm,d);
    	  this.cName=c;
    	  this.des=de;
      }
	  
	  void display() {
		  super.display();
		  System.out.println("Company name:"+this.cName);
		  System.out.println("Desgination:"+this.des);

	  }
}

public class InheritanceDemo {

	public static void main(String[] args) {
         Student s1=new Student();
         Student s2=new Student();
         Student s3=new Student();
        
         
         PlacedStudent ps1=new PlacedStudent(101,"Sahil",20,"tcs","Developer");
         ps1.display();
         PlacedStudent ps2=new PlacedStudent();
         

	}

}
