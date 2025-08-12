package assign2;

public class Age {

	public static void main(String[] args) {
		int age=30;

	    if(age<12){
	        System.out.printf("It is a child");
	    }
	    else if(age>=12 && age<=19){
	    	System.out.printf("It is a teenager");
	    }
	    else if(age>=20 && age<=59){
	    	System.out.printf("It is Adult");
	    }
	    else if(age>60){
	    	System.out.printf("senior");
	    }
	}

}
