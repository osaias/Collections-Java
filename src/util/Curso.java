package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 * Classe que representa o curso.
 * Contém uma lista de alunos e aulas, e os instrutores do curso.
 * 
 * @author osaias.saraiva
 */
public class Curso {

	
	private List<Aluno> alunos = new LinkedList<>();

	
	private Set<Instrutor> instrutores = new HashSet<>();

	
	private List<Aula> aulas = new ArrayList<>();


	public void adicionaAluno(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo...");
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
			throw new IllegalArgumentException("O aluno está nulo...");
		}

		return this.alunos.contains(aluno);
	}

	/**
	 * Atributo que representa os alunos matriculados no curso.
	 * Foi utilizado uma LinkedList para recuperar o aluno
	 * pelo seu nome.
	 * Lembrando que esta lista não é indexada. Porém a performance de inserção
	 *  ou remoção de novos alunos no meio da lista é melhor.
	 * 
	 * @author osaias.saraiva
	 */
	public Aluno getAluno(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo...");
		}

		if (!this.alunos.contains(aluno)) {
			throw new IllegalArgumentException("O aluno não está matriculado no curso...");
		}

		return this.alunos.get(this.alunos.indexOf(aluno));
	}

	/**
	 * Atributo que representa os instrutores do curso.
	 * Foi utilizado um HashSet para armazenar os instrutores 
	 * do curso. Neste caso, os instrutores serão recuperados 
	 * usando os métodos equals() e hashCode() da classe 
	 * Instrutor.
	 * A interface Set não tem metodo get() para 
	 * recuperar elementos.
	 * 
	 * @author osaias.saraiva
	 */
	public void adicionaInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor está nulo...");
		}

		this.instrutores.add(instrutor);
	}

	public boolean removeInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor está nulo...");
		}

		if (this.instrutores.contains(instrutor)) {
			return this.instrutores.remove(instrutor);
		}

		return false;
	}

	public boolean contemInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor está nulo...");
		}

		return this.instrutores.contains(instrutor);
	}

	/*public Instrutor getInstrutor(Instrutor instrutor) {

		if (instrutor == null) {
			throw new IllegalArgumentException("O instrutor está nulo...");
		}

		if (!this.instrutores.contains(instrutor)) {
			throw new IllegalArgumentException("O instrutor não está matriculado no curso...");
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
			throw new IllegalArgumentException("O aula está nulo...");
		}

		this.aulas.add(aula);
	}
	
	public void adicionaAula(int index, Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula está nulo...");
		}

		this.aulas.add(index, aula);
	}

	public boolean removeAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula está nulo...");
		}

		if (this.aulas.contains(aula)) {
			return this.aulas.remove(aula);
		}

		return false;
	}

	public boolean contemAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula está nulo...");
		}

		return this.aulas.contains(aula);
	}

	/**
	 * Atributo que repesenta as aulas do curso.
	 * Foi utilizado uma ArrayList pra recuperar o aulas
	 * pelo seu indice ou nome.
	 * Este tipo de lista é indexada, com isso, favorece a recuperação de
	 *  elementos pelo seu indice. Porém a inserção e remoção de novas aulas 
	 *  no meio da lista tende a ser mais lenta, devido a necessidade de realocar 
	 *  todos os outros elementos à partir do indice de inserção/remoção do novo elemento.
	 *  
	 *  @author osaias.saraiva
	 */
	public Aula getAula(Aula aula) {

		if (aula == null) {
			throw new IllegalArgumentException("O aula está nulo...");
		}

		if (!this.aulas.contains(aula)) {
			throw new IllegalArgumentException("O aula não está registrado no curso...");
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
