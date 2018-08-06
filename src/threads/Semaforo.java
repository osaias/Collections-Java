package threads;

public class Semaforo implements Runnable{

	private CorSemaforo sinal = CorSemaforo.amarelo;
	private boolean mudou = false;
	
	@Override
	public void run() {
		if (!mudou) {
			try {
				wait();
				return;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.mudar();
		notify();
		
		if (mudou) {
			
			this.mudou = false;
		}
		
	}
	
	public synchronized void mudar() {
		switch(sinal) {
			case verde:
				this.sinal = CorSemaforo.amarelo;
				break;
			case amarelo:
				this.sinal = CorSemaforo.vermelho;
				break;
			case vermelho:
				this.sinal = CorSemaforo.verde;
				break;
		}
		
		System.out.println(this.sinal);
		this.mudou = true;
	}
}