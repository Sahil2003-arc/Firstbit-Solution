package p2;

class LowMarkException extends Exception{
	public String toString() {
		return "marks less than zero";
	}
} 
class HighMarkException extends Exception{
	public String toString() {
		return "marks greater than 100";
	}
}
public class Test {
	public static void main(String[]args) {
		int marks=200;
		try {
			if(marks<=0)
				throw new LowMarkException();
			if(marks>100)
				throw new HighMarkException();
		}
		catch(LowMarkException lme) {
			System.out.println(lme);
		}
		catch(HighMarkException hme) {
			System.out.println(hme);
			
		}
	}

}
