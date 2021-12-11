package threadspratice;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Am Runnable Thred...");

	}

	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread t = new Thread(r);
		t.start();

	}

}
