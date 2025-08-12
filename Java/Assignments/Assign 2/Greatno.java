package assign2;
import java.util.Scanner;
public class Greatno {

	public static void main(String[] args) {
		 int a,b,c;
		 
		    Scanner sc = new Scanner(System.in);
		    System.out.printf("Enter three numbers:");
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();

		    if (a>b) 
		    {
		        if (a>c) 
		        {
		        	System.out.printf("The greatest number is " + a);
		        } 
		        else 
		        {
		        	System.out.printf("The greatest number is " + c);
		        }
		    }
		     else
		    {
		        if (b>c) 
		        {
		        	System.out.printf("The greatest number is " + b);
		        } 
		        else 
		        {
		        	System.out.printf("The greatest number is " + c);
		        }
		    }
		    sc.close();
	}

}
