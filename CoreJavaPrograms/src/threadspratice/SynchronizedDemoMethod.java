package threadspratice;

public class SynchronizedDemoMethod {
	public static void main(String[] args) {
		String str = "hai";
		System.out.println("Main class Thread");
	}

	public void m1() {
		SynchronizedDemoMethod m = new SynchronizedDemoMethod();

		synchronized (m) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread interrupted.");
			}
		}
		System.out.println("Child class " + m);
	}

}
