package assign1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int a,no,rem,rev=0;
		 Scanner sc = new Scanner(System.in);  
	        System.out.print("Enter the number: ");
	        a = sc.nextInt();
	    int temp=a;
	    no=a;

	    while (temp!=0)
	    {
	        rem=temp%10;
	        rev=rev*10+rem;
	        temp=temp/10;
	    }
	    if(no==rev){
	        System.out.printf("number is palindrome");
	    }else{
	    	System.out.printf("number is not palindrome");
	    }
	    sc.close();

	}

}
