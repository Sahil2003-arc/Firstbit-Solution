package assign3;

public class Armstrong {

	public static void main(String[] args) {
		int num=154,r;
	    int temp=num;
	    int sum=0;

	    while(temp!=0)
	    {
	     r=temp%10;
	     sum=sum+r*r*r;
	     temp=temp/10;
	    }
	     
	    if(sum==num){
	        System.out.printf("it is armstrong");
	    }else{
	        System.out.printf("it is not armstrong");
	    }
	}

}
