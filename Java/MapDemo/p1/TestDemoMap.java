
package p1;
import java.util.*;
class Mykey implements Comparable {
	int key;
	

	public Mykey(int key) {
		super();
		this.key = key;
	}
	
	
	public Mykey() {
		super();
		// TODO Auto-generated constructor stub
	}


	int getKey() {
		return key;
	}
	void setKey(int key) {
		this.key = key;
	}
	
	
	@Override
	public String toString() {
		return "Mykey [key=" + this.key + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Mykey mk=(Mykey)o;
		return this.key-mk.key;
	}	
}
class Ghodagadi{
	int number;
	String name;
	public Ghodagadi() {
		super();
		// TODO Auto-generated constructor stub
		number=101;
		name="not given";
		
	}
	
	public Ghodagadi(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nGhodagadi [number=" + this.number + ", name=" + this.name + "]";
	}
	
	
	
}

public class TestDemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		tm.put(new Mykey(45), new Ghodagadi(45,"rohit"));
		tm.put(new Mykey(18), new Ghodagadi(18,"virat"));
		tm.put(new Mykey(10), new Ghodagadi(10,"vir"));
		System.out.println(tm);
		
		
	}

}
