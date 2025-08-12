package p1;


public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {10,2};
			int a=arr[0];
			int b=arr[2];
			int c=a/b;
			System.out.println("Ans is"+c);
		}
		catch(Exception e) {
			System.out.println("some error");
		}
		catch(ArithmeticException e) {
			System.out.println("plzz don't provide 0 in b");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("plz only provide index only 0,1");
		}
		

	}

}