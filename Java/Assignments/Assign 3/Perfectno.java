package assign3;
import java.util.Scanner;
public class Perfectno {

	public static void main(String[] args) {
		int no,sum=0;
		Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter a number:");
	    no = sc.nextInt();

	    for(int i=1;i<no;i++) 
	    {
	        if(no%i==0) 
	        {
	            sum+=i;
	        }
	    }

	    if(sum==no) 
	    {
	    	System.out.printf("%d is a perfect number.",no);
	    } 
	    else 
	    {
	    	System.out.printf("%d is not a perfect number.",no);
	    }
	}

}
