package assignment;

interface Vehicle{
	void brake();
	abstract void start();
	public abstract void stop();
}

class car implements Vehicle{
	public void brake() {
		System.out.println("Brake :");
	}

	public void start() {
		System.out.println("start :");		
	}

	public void stop() {
		System.out.println("Stop :");		
	}
}
public class Polyvehicle {

	public static void main(String[] args) {
		Vehicle v1=new car();
		v1.brake();
		v1.start();
		v1.stop();
		

	}

}
