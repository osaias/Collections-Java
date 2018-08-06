package List;


public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		
		a1.setNome("José");
		a1.setPontos(100);
		a2.setNome("Maria");
		a2.setPontos(50);
		a3.setNome("Paulo");
		a3.setPontos(70);
		a4.setNome("Bruna");
		a4.setPontos(85);
		a5.setNome("Rita");
		a5.setPontos(20);
		
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
		a6.setNome("Rui");
		System.out.println(a1.toString() + "=>" + lista.contem(a1));
		System.out.println(a4.toString() + "=>" + lista.contem(a4));
		System.out.println(a6.toString() + "=>" + lista.contem(a6));
		
		System.out.println("\nPegando um aluno na lista:");
		System.out.println(lista.pega(3));
		
		System.out.println("\nVerificando o tamanho da lista:");
		System.out.println(lista.tamanho());
	}

}
