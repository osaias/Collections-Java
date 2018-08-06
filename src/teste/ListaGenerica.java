package teste;

import util.Aluno;

/*
 * Esta classe cria uma instancia do tipo Object 
 * no qual ela poderia trabalhar com qualquer tipo.
 * Mas terá a necessidade de usar o casting.
 * Uma outra opção será usar a classe ArrayList que tem 
 * a mesma estrutura e é nativa do java.
 */
public class ListaGenerica {
	
	private Object[] objetos = new Object[2];
	private int totalObjetos = 0;

	public void adiciona(Aluno aluno) {
		this.garantaEspaco();
		this.objetos[this.totalObjetos] = aluno;
		this.totalObjetos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = this.totalObjetos - 1; i >= posicao; i-=1) {
			this.objetos[i + 1] = this.objetos[i];
		}
		
		this.objetos[posicao] = aluno;
		this.totalObjetos++;
	}

	public Object pega(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.objetos[posicao]; 
	}

	public void remove(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = posicao; i < this.totalObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		
		this.totalObjetos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalObjetos; i++) {
			if (this.objetos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalObjetos;
	}

	public String toString() {

		if (this.totalObjetos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();

		builder.append("[");

		for (int i = 0; i < this.totalObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}

		builder.append(this.objetos[this.totalObjetos - 1]);
		builder.append("]");

		return builder.toString();
	}
	
	private boolean posicaoValida(int posicao) { 
		return posicao >= 0 && posicao < this.totalObjetos;
	}
	
	private void garantaEspaco() {
		if (this.objetos.length == this.totalObjetos) {
			Object[] maisObjetos = new Aluno[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				maisObjetos[i] = this.objetos[i];
			}
			this.objetos = maisObjetos;//recebe o array dimensionado.
		}
	}
}
