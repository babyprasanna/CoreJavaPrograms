package threadspratice;

public class ThreadDemo extends Thread {
	public void run() {
		System.out.println("New Thread...");
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
	}

}
