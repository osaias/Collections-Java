package util;

/**
 * 
 * Classe que representa a aula do curso.<br>
 *Contém o nome da aula, numero e descrição.
 *Recebe como parametros no construtor o número e o nome da aula.
 *
 *@author osaias.saraiva
 */
public class Aula {

	private String nome;
	private int numero;
	private String descrição;
	
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

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
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
