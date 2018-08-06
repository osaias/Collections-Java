package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 * @author osaias.saraiva
 *
 * Classe que representa o curso.<br>
 * Cont�m uma lista de alunos e aulas, e os instrutores do curso.
 */
public class Curso {

	/**
	 * Atributo que representa os alunos matriculados no curso.<br>
	 * Foi utilizado uma <strong>LinkedList</strong> para recuperar o aluno
	 * pelo seu nome.<br>
	 * Lembrando que esta lista n�o � indexada. Por�m a performance de inser��o
	 *  ou remo��o de novos alunos no meio da lista � melhor.
	 * 
	 */
	private List<Aluno> alunos = new LinkedList<>();

	/**
	 * Atributo que representa os instrutores do curso.<br>
	 * Foi utilizado um <HashSet> para armazenar os instrutores 
	 * do curso. Neste caso, os instrutores ser�o recuperados 
	 * usando os m�todos equals() e hashCode() da classe 
	 * <strong>Instrutor</Strong>.<br>
	 * A interface <strong>Set</strong> n�o tem metodo get() para 
	 * recuperar elementos.
	 */
	private Set<Instrutor> instrutores = new HashSet<>();

	/**
	 * Atributo que repesenta as aulas do curso.<br>
	 * Foi utilizado uma <strong>ArrayList</strong> pra recuperar o aulas
	 * pelo seu indice ou nome.<br>
	 * Este tipo de lista � indexada, com isso, favorece a recupera��o de
	 *  elementos pelo seu indice. Por�m a inser��o e remo��o de novas aulas 
	 *  no meio da lista tende a ser mais lenta, devido a necessidade de realocar 
	 *  todos os outros elementos � partir do indice de inser��o/remo��o do novo elemento.
	 */
	private List<Aula> aulas = new ArrayList<>();


	public void adicionaAluno(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo...");
		}

		this.alunos.add(aluno);
	}

	public boolean removeAluno(Aluno aluno) {



		if (this.alunos.contains(aluno)) {
			return this.alunos.remove(aluno);
		}

		return false;
	}

	public boolean contemAluno(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo...");
		}

		return this.alunos.contains(aluno);
	}

	public Aluno getAluno(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo...");
		}

		if (!this.alunos.contains(aluno)) {
			throw new IllegalArgumentException("O aluno n�o est� matriculado no curso...");
		}

		return this.alunos.get(this.alunos.indexOf(aluno));
	}

	public void adicionaInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor est� nulo...");
		}

		this.instrutores.add(instrutor);
	}

	public boolean removeInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor est� nulo...");
		}

		if (this.instrutores.contains(instrutor)) {
			return this.instrutores.remove(instrutor);
		}

		return false;
	}

	public boolean contemInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor est� nulo...");
		}

		return this.instrutores.contains(instrutor);
	}

	/*public Instrutor getInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor est� nulo...");
		}

		if (!this.instrutores.contains(instrutor)) {
			throw new IllegalArgumentException("O instrutor n�o est� matriculado no curso...");
		}

		Instrutor next = null;
		Iterator<Instrutor> iterator = this.instrutores.iterator();
		while(iterator.hasNext()) {
			next = iterator.next();
			if (next.equals(instrutor))
				return next;
		}
		return next;

	}*/

	public void adicionaAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula est� nulo...");
		}

		this.aulas.add(aula);
	}
	
	public void adicionaAula(int index, Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula est� nulo...");
		}

		this.aulas.add(index, aula);
	}

	public boolean removeAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula est� nulo...");
		}

		if (this.aulas.contains(aula)) {
			return this.aulas.remove(aula);
		}

		return false;
	}

	public boolean contemAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula est� nulo...");
		}

		return this.aulas.contains(aula);
	}

	public Aula getAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula est� nulo...");
		}

		if (!this.aulas.contains(aula)) {
			throw new IllegalArgumentException("O aula n�o est� registrado no curso...");
		}

		return this.aulas.get(this.aulas.indexOf(aula));
	}

	public Aula getAula(int index) {

		return this.aulas.get(index);
	}

	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(alunos);
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public Set<Instrutor> getInstrutores() {
		return Collections.unmodifiableSet(instrutores);
	}
}
