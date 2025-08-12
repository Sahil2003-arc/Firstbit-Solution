
package p2;
import p1.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IdComparator implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o1;
		return p1.getId()-p2.getId();
			
	}
	
	
}
class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		String s1=p1.getName();
		String s2=p2.getName();
		
		
		return s1.compareTo(s2);
	}
	
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		Product p1=new Product(105,"parle-g");
		Product p2=new Product(102,"goodday");
		Product p3=new Product(107,"happy");
		Product p4=new Product(101,"goodday");
		
		
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		
//		System.out.println(a1);
//		IdComparator c1=new IdComparator();
//		Collections.sort(a1,c1);
//		System.out.println("after sort"+a1);
		
		NameComparator nc=new NameComparator();
		Collections.sort(a1,nc);
		System.out.println("after sort"+a1);
		
		
		
		
		
		

	}

}
