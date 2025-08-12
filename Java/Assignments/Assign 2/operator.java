package assign2;
import java.util.Scanner;
public class operator {

	public static void main(String[] args) {
		int res,no1,no2;

	    char op;
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter the first number:");
	    no1 = sc.nextInt();
	    System.out.printf("Enter the second number:");
	    no2 = sc.nextInt();

	    System.out.printf("Choose the operator(+,-,/,*):");
	    op = sc.next().charAt(0);
	    
	    if(op=='+'){
	        res=no1+no2;
	    }
	    else if(op=='-'){
	        res=no1-no2;
	    }
	    else if(op=='/'){
	        res=no1/no2;
	    }
	    else if(op=='*'){
	        res=no1*no2;
	    }
	    else{
	        res=no1%no2;
	    }
	    System.out.printf("Result= " + res);

	    sc.close();
	}

}
