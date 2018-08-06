package List;

/*
 * Com a classe ArrayList foi possivel usar os mesmos métodos da TesteAluno.
 * Sem a necessidade de criar a estrutura ListaGenerica que trabalha com tipo Object.
 * e sem utilizar a estrutura ListaDeAlunos do tipo Aluno.
 * Neste caso, utilizando o Generics <Tipo> o casting é automatico.
 */
import java.util.ArrayList;

public class TesteArrayList {

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
		a6.setNome("Rui");
		System.out.println(a1.toString() + "=>" + lista.contains(a1));
		System.out.println(a4.toString() + "=>" + lista.contains(a4));
		System.out.println(a6.toString() + "=>" + lista.contains(a6));
		
		System.out.println("\nPegando um aluno na lista:");
		System.out.println(lista.get(3));
		
		System.out.println("\nVerificando o tamanho da lista:");
		System.out.println(lista.size());
	}

}
