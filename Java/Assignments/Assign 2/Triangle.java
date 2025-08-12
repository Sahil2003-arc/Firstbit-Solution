package assign2;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int side1, side2, side3;

		  Scanner sc = new Scanner(System.in);
		  System.out.printf("Enter the lengths of the three sides of the triangle: ");
		  side1 = sc.nextInt();
		  side2 = sc.nextInt();
		  side3 = sc.nextInt();
		  

		  if (side1 == side2 && side2 == side3) {
			  System.out.printf("Equilateral triangle\n");
		  } else if (side1 == side2 || side1 == side3 || side2 == side3) {
			  System.out.printf("Isosceles triangle\n");
		  } else {
			  System.out.printf("Scalene triangle\n");
		  }
		  sc.close();
	}

}
