package assign2;

public class Divisible {

	public static void main(String[] args) {
		int num=10;

	    if(num%3==0 && num%5==0)
	    {
	        System.out.printf("Divisible both");
	    }
	    else if(num%3==0)
	    {
	    	System.out.printf("Divisible by 3 but not by 5");
	    }
	    else if(num%5==0)
	    {
	    	System.out.printf("Divisible by 5 but not by 3");
	    }
	    else{
	    	System.out.printf("Divisible by none");
	    }
	}

}
