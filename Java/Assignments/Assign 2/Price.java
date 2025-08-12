package assign2;
import java.util.Scanner;
public class Price {

	public static void main(String[] args) {
		int price;
	    char student;
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Are you a student: ");
	    student = sc.next().charAt(0);
	    System.out.printf("Enter the price: ");
	    price = sc.nextInt();
	    if(student=='Y' || student=='y'){
	        if(price>=500)
	        {
	        	System.out.printf("you got 20 discount");
	        }
	        else
	        {
	        	System.out.printf("you got 10 discount");
	        }
	    }
	    else
	    {
	        if(price>=600)
	        {
	        	System.out.printf("You got 15 discount");
	        }
	        else
	        {
	        	System.out. printf("No discount");
	        }
	    }
	    sc.close();
	}

}
