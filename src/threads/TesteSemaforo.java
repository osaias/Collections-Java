package threads;

public class TesteSemaforo {

	public static void main(String[] args) {
		
		Semaforo s = new Semaforo();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		
		t1.start();
		t2.start();
	}

}
