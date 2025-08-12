package assign3;

public class Prime {

	public static void main(String[] args) {
		
	    int i=2;
	    int flag=0;
	    int no=10;
	    
	    while (i<no)
	    {
	        if(no%i==0){
	            flag=1;
	            break;
	        }
	        i++;
	    }
	    if(flag==0){
	        System.out.printf("Prime");
	    }else{
	    	 System.out.printf("Not prime");
	    }
	}

}
