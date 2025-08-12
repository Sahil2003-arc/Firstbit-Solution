package assign1;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter the char: ");
	    
	    ch = sc.next().charAt(0);

	     if(ch >= 'a' && ch <= 'z')
	     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	     {
	    	 System.out.printf("Is it vowel",ch);
	    }
	    else
	    {
	    	 System.out.printf("is it consonant",ch);
	    }
	    else{
	    	 System.out.printf("it is not charater");
	    }
        
	     sc.close();
	}

}
