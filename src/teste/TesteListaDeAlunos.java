package teste;

import util.Aluno;

public class TesteListaDeAlunos {

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
		
		ListaDeAlunos lista = new ListaDeAlunos();
		
		System.out.println("Adicionando alunos no fim da lista:");
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista);
		
		System.out.println("\nAdicionando alunos na posição da lista:");
		lista.adiciona(1, a4);
		lista.adiciona(2, a5);
		
		System.out.println(lista);
		
		System.out.println("\nRemovendo " + lista.pega(3) + " da lista:");
		lista.remove(3);
		
		System.out.println(lista);
		
		System.out.println("\nVerificando se o aluno está na lista:");
		System.out.println(a1.toString() + "=>" + lista.contem(a1));
		System.out.println(a4.toString() + "=>" + lista.contem(a4));
		System.out.println(a6.toString() + "=>" + lista.contem(a6));
		
		System.out.println("\nPegando um aluno na lista:");
		System.out.println(lista.pega(3));
		
		System.out.println("\nVerificando o tamanho da lista:");
		System.out.println(lista.tamanho());
	}

}
