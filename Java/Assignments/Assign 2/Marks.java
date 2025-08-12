package assign2;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		int marks;
        
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the marks:");
	    marks = sc.nextInt();

	    if(marks>75){
	        System.out.printf("Distinction\n");
	    }else if(marks>65){
	    	System.out.printf("First class\n");
	    }else if(marks>55){
	    	System.out.printf("Second class\n");
	    }else if(marks>40){
	    	System.out.printf("Pass\n");
	    }else{
	    	System.out.printf("Fail\n");
	    }
	    sc.close();
	}

}
