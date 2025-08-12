package assign1;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		double da,ta,hr,basic,totalsalary;

		Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter the basic:");
	    basic = sc.nextDouble();

	    if (basic<=5000)
	    {
	        da=0.10*basic;
	        ta=0.20*basic;
	        hr=0.25*basic;
	    }
	    else
	    {
	        da=0.15*basic;
	        ta=0.25*basic;
	        hr=0.30*basic;
	    }
	    totalsalary=da+ta+hr+basic;
	    System.out.printf("Total salary " + totalsalary);

	}

}
