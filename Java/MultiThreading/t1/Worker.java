package t1;

public class Worker extends Thread{
  public void run() {
	  String str = "1234567890987654321";
	  for (int i = 0; i < str.length(); i++) {
		System.out.print(" " + str.charAt(i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  }
}

class AnotherThread implements Runnable{
	 
	
	  @Override
	  public void run() {
		  String str="!@#$%^&*())_+#%*#^";
		  for (int i = 0; i < str.length(); i++) {
			System.out.print(" " + str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	  }
 }
}

class MainThread{
	public static void main(String[]args) {
		Worker w1 = new Worker();
		w1.start();
		
		AnotherThread aw = new AnotherThread();
		Thread t1 = new Thread(aw);
		t1.start();
		
		 String str = "abcdefghigklmnopqrstuvwxyz";
		  for (int i = 0; i < str.length(); i++) {
			System.out.print(" " + str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
