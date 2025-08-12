package assignment;
import java.util.Scanner;
public class Functions {

	public static void main(String[] args) {
		
		 int a,b;
		 a=10;
		 b=20;
		    int choice;
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your choice: 1 for add, 2 for sub, 3 for mul");
	        choice = sc.nextInt();
	        
	        switch (choice) {
            case 1:
                add(a,b);
                break;
            case 2:
                sub(a,b);
                break;
            case 3:
                mul(a,b);
                break;
            default:
                System.out.println("Invalid choice");
        }
		 sc.close();
		   
		}
		public static void add(int a, int b){
		   int c=a+b;
		    System.out.printf("%d",c);
		}

		public static void sub(int a, int b){
			   int c=a-b;
			   System.out.printf("\n%d",c);
			}
		public static void mul(int a, int b){
			   int c=a*b;
			    System.out.printf("\n%d",c);
	}

}
