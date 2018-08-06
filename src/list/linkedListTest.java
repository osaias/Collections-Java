package list;

import util.Aluno;
import util.Curso;

public class linkedListTest {

	public static void main(String[] args) {

		Aluno jose = new Aluno("José",1112225);
		Aluno maria = new Aluno("Maria",2223569);
		Aluno paulo = new Aluno("Paulo",3654789);
		Aluno bruna = new Aluno("Bruna",3215698);
		Aluno rita = new Aluno("Rita", 4569877);
		Aluno rui = new Aluno("Rui", 9875466);

		jose.setNota(10.0);
		maria.setNota(5.0);
		paulo.setNota(7.0);
		bruna.setNota(8.5);
		rita.setNota(2.0);
		rui.setNota(3.1);

		Curso java = new Curso();
		
		java.adicionaAluno(jose);
		java.adicionaAluno(maria);
		java.adicionaAluno(paulo);
		java.adicionaAluno(bruna);
		java.adicionaAluno(rita);
		
		System.out.println("Alunos matriculados no curso: ");
		java.getAlunos().forEach(a -> System.out.println(a.toString()));
		
		System.out.println("\nRecuperando aluno: ");
		System.out.println(java.getAluno(bruna));
		
		System.out.println("\nRemovendo aluno: ");
		System.out.println(java.removeAluno(paulo));
		
		System.out.println("\nO Rui está na lista: ");
		System.out.println(java.contemAluno(rui));
	}

}
