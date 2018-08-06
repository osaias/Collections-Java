package list;

import util.Aula;
import util.Curso;

public class ArrayListTest {

	public static void main(String[] args) {

		Aula polimorfismo = new Aula(01, "polimorfismo");
		Aula encapsulamento = new Aula(02, "encapsulamento");
		Aula heranca = new Aula(03, "heranca");
		Aula teste = new Aula(05, "teste");
		Aula threads = new Aula(06, "threads");
		Aula modificadores = new Aula(07, "modificadores");
		
		long inicio = 0l;
		long fim = 0l;
		
		Curso java = new Curso();
		
		java.adicionaAula(encapsulamento);
		java.adicionaAula(heranca);
		java.adicionaAula(polimorfismo);
		java.adicionaAula(teste);
		java.adicionaAula(threads);
		
		System.out.println("Adicionando a aula modificadores na posição 4\n");
		java.adicionaAula(3,modificadores);
		
		System.out.println("Aulas do curso: ");
		java.getAulas().forEach(a -> System.out.println(a.toString()));
		
		System.out.println("\nRecuperando aula heranca: ");
		inicio = System.currentTimeMillis();
		System.out.println(java.getAula(heranca));
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio)/1000.0);
		
		System.out.println("\nRemovendo aula polimorfismo: ");
		inicio = System.currentTimeMillis();
		System.out.println(java.removeAula(polimorfismo));
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio)/1000.0);
		
		System.out.println("\nA aula heranca está na lista: ");
		inicio = System.currentTimeMillis();
		System.out.println(java.contemAula(heranca));
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio)/1000.0);
		
		System.out.println("\nRecuperando aula no index 1: ");
		inicio = System.currentTimeMillis();
		System.out.println(java.getAula(1));
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio)/1000.0);

	}

}
