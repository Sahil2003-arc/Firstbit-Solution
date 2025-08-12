package assign1;
import java.util.Scanner;
public class Upperlower {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter a character:");
	    
	    ch = sc.next().charAt(0);
	    
	    if (ch>='A' && ch<='Z') 
	    {
	    	System.out.printf("The character '%c' is uppercase.\n",ch);
	    }
	    else if (ch>='a' && ch<='z') 
	    {
	    	System.out.printf("The character '%c' is lowercase.\n",ch);
	    }
	    else {
	    	System.out.printf("The character '%c' is not an alphabet letter.\n",ch);
	    }
        
	    sc.close();
	}

}
