package util;

/**
 * 
 *  que representa o aluno matriculado no curso.
 * O aluno contém o nome, nota geral, e o numero da matricula.
 * Recebe no construtor o nome e a matricula como parametros.
 * 
 * @author osaias.saraiva
 * 
 */

public class Aluno {
	
	private String nome;
	

	private double nota;
	
	private int matricula;
		
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNotas() {
		return nota;
	}
	
	
	public int getMatricula() {
		return matricula;
	}

	public String toString() {
		return this.nome; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	
}
