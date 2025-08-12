package p2;

class VoterAgeException extends Exception {

	public String toString() {
		return "Invalid age! you can't vote";

	}
}

class Voter {
	int age;

	Voter(int a) {
		this.age = a;
	}

	void validate() throws VoterAgeException {
		if (this.age < 18) {
			throw new VoterAgeException();
		} else {
			System.out.println("You can vote");
		}
	}

}

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Hello");
		Voter v1 = new Voter(17);
		try {
			v1.validate();
		} catch (VoterAgeException vae) {
			System.out.println("inside main");
			System.out.println(vae);
			vae.printStackTrace();
		}
		finally {
			System.out.println("inside finally");
		}

	}

}