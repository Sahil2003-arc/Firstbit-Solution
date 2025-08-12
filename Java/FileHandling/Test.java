package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rollno;
	String name;
	public Student() {
		this.rollno = 0;
		this.name = "not given";
		
	}
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
public class Test {

	public static void main1(String[] args) {
	try{
		Student s1=new Student();
		FileOutputStream fos=new FileOutputStream("myfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("data stored in");
	}
	catch(Exception e){
		System.out.println("not found this file");
		e.printStackTrace();
	}

	}


public static void main(String[] args) {
	try{
		Student s1=new Student();
		FileInputStream fis=new FileInputStream("myfile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s11=(Student)ois.readObject();
		System.out.println("data stored");
	}
	catch(Exception e){
		System.out.println("not found this file");
		e.printStackTrace();
	}

	}

}



//--------> 2nd code if 1st code doesn't work

//package filehandling;
//
//import java.io.*;
//
//// ------------ Student Class ------------
//class Student implements Serializable {
//    private int rollno;
//    private String name;
//
//    // Default Constructor
//    public Student() {
//        this.rollno = 0;
//        this.name = "not given";
//    }
//
//    // Parameterized Constructor
//    public Student(int rollno, String name) {
//        this.rollno = rollno;
//        this.name = name;
//    }
//
//    // Getters and Setters
//    public int getRollno() {
//        return rollno;
//    }
//
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // toString method
//    @Override
//    public String toString() {
//        return "Student [rollno=" + rollno + ", name=" + name + "]";
//    }
//}
//
//// ------------ Test Class ------------
//public class Test {
//    public static void main(String[] args) {
//
//        // ----- Serialization (Writing Object to File) -----
//        try {
//            Student s1 = new Student(101, "Sahil");
//
//            FileOutputStream fos = new FileOutputStream("myfile.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(s1);
//
//            oos.close();
//            fos.close();
//
//            System.out.println("✅ Data written to file.");
//        } catch (Exception e) {
//            System.out.println("❌ Error writing to file.");
//            e.printStackTrace();
//        }
//
//        // ----- Deserialization (Reading Object from File) -----
//        try {
//            FileInputStream fis = new FileInputStream("myfile.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//            Student s2 = (Student) ois.readObject();
//
//            ois.close();
//            fis.close();
//
//            System.out.println("✅ Data read from file: " + s2);
//        } catch (Exception e) {
//            System.out.println("❌ Error reading from file.");
//            e.printStackTrace();
//        }
//    }
//}
//}