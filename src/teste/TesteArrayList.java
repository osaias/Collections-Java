package teste;

/*
 * Com a classe ArrayList foi possivel usar os mesmos métodos da TesteAluno.
 * Sem a necessidade de criar a estrutura ListaGenerica que trabalha com tipo Object.
 * e sem utilizar a estrutura ListaDeAlunos do tipo Aluno.
 * Neste caso, utilizando o Generics <Tipo> o casting é automatico.
 */
import java.util.ArrayList;

import util.Aluno;

public class TesteArrayList {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("José",1112225);
		Aluno a2 = new Aluno("Maria",2223569);
		Aluno a3 = new Aluno("Paulo",3654789);
		Aluno a4 = new Aluno("Bruna",3215698);
		Aluno a5 = new Aluno("Rita", 4569877);
		Aluno a6 = new Aluno("Rui", 9875466);

		a1.setNota(10.0);
		a2.setNota(5.0);
		a3.setNota(7.0);
		a4.setNota(8.5);
		a5.setNota(2.0);
		
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		
		System.out.println("Adicionando alunos no fim da lista:");
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		System.out.println(lista);
		
		System.out.println("\nAdicionando alunos na posição da lista:");
		lista.add(1, a4);
		lista.add(2, a5);
		
		System.out.println(lista);
		
		System.out.println("\nRemovendo " + lista.get(3) + " da lista:");
		lista.remove(3);
		
		System.out.println(lista);
		
		System.out.println("\nVerificando se o aluno está na lista:");
		System.out.println(a1.toString() + "=>" + lista.contains(a1));
		System.out.println(a4.toString() + "=>" + lista.contains(a4));
		System.out.println(a6.toString() + "=>" + lista.contains(a6));
		
		System.out.println("\nPegando um aluno na lista:");
		System.out.println(lista.get(3));
		
		System.out.println("\nVerificando o tamanho da lista:");
		System.out.println(lista.size());
	}

}
