package threads;

public class TiqueTaque {

	private boolean tique;

	public synchronized void tique(boolean executando) {
		
		//verifica se o vlr passado não é true
		if (!executando) {
			tique = true; //por causa do while logo abaixo
			notify();
			return;
		}

		//se ovlr passado for true
		System.out.print("Tic-");
		tique = true;//por causa do while logo abaixo
		notify();

		try {
			while(tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void taque(boolean executando) {

		if (!executando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Tac");
		tique = false;
		notify();

		try {
			while(!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
