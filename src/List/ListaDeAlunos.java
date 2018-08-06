package List;

/*
 * Esta classe está muita atrelada ao seu tipo, pois só é possivel criar
 * uma lista de alunos.
 */
public class ListaDeAlunos {

	private Aluno[] alunos = new Aluno[1000];
	private int totalAlunos = 0;

	public void adiciona(Aluno aluno) {

		// Neste caso tem percorrer todo o array...

		/*for (int i = 0; i < this.alunos.length; i++) {
			if (this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}*/

		// Aqui não é necessário percorrer o array...
		this.garantaEspaco();
		this.alunos[this.totalAlunos] = aluno;
		this.totalAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		//Neste caso, percorre-se todo o array.
		/*if (this.alunos[posicao] == null) {
			this.alunos[posicao] = aluno;
		} else {
			Aluno alunoAtual;
			Aluno trocaAluno = aluno;
			for (int i = posicao; i < this.alunos.length; i++) {
				alunoAtual = this.alunos[i];
				this.alunos[i] = trocaAluno;
				trocaAluno = alunoAtual;
			}
		}*/
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		for (int i = this.totalAlunos - 1; i >= posicao; i-=1) {
			this.alunos[i + 1] = this.alunos[i];
		}

		this.alunos[posicao] = aluno;
		this.totalAlunos++;
	}

	public void adicionaNoComeco(Aluno aluno) {

		this.garantaEspaco();

		for (int i = this.totalAlunos; i > 0; i--) {
			this.alunos[i] = this.alunos[i - 1];
		}

		this.alunos[0] = aluno;
		this.totalAlunos++;
	}

	public Aluno pega(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.alunos[posicao]; 
	}

	public void remove(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		for (int i = posicao; i < this.totalAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}

		this.totalAlunos--;
	}

	public void removeNoComeco() {

		if (this.totalAlunos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		} else {
			for (int i = 0; i < this.totalAlunos - 1; i++) {
				this.alunos[i] = this.alunos[i + 1];
			}
			this.alunos[this.totalAlunos - 1] = null;
			this.totalAlunos--;
		}
	}

	public void removeNoFim() {
		
		if (this.totalAlunos == 0) {
			throw new IllegalArgumentException("Lista vazia");
		} else {
			this.alunos[this.totalAlunos - 1] = null;
			this.totalAlunos--;
		}
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalAlunos; i++) {
			if (this.alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalAlunos;
	}

	public String toString() {
		//return Arrays.toString(alunos);

		if (this.totalAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		
		builder.append("[");

		for (int i = 0; i < this.totalAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalAlunos - 1]);
		builder.append("]");

		return builder.toString();
	}

	private boolean posicaoValida(int posicao) { 
		return posicao >= 0 && posicao < this.totalAlunos;
	}

	private void garantaEspaco() {
		if (this.alunos.length == this.totalAlunos) {
			Aluno[] maisAlunos = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				maisAlunos[i] = this.alunos[i];
			}
			this.alunos = maisAlunos;//recebe o array dimensionado.
		}
	}
}
