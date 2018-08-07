package util;

/**
 * 
 * Classe que representa a aula do curso.<br>
 *Cont�m o nome da aula, numero e descri��o.
 *Recebe como parametros no construtor o n�mero e o nome da aula.
 *
 *@author osaias.saraiva
 */
public class Aula {

	private String nome;
	private int numero;
	private String descri��o;
	
	public Aula(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
}
