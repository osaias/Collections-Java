package set;

import util.Curso;
import util.Instrutor;

public class HashSetTest {

	public static void main(String[] args) {
		
		Instrutor paulo = new Instrutor("Paulo Silveria");
		Instrutor paola = new Instrutor("Paola Rosa");
		Instrutor rosa = new Instrutor("Rosa Miller");
		
		Curso java = new Curso();
		
		java.adicionaInstrutor(paulo);
		java.adicionaInstrutor(paola);
		java.adicionaInstrutor(rosa);
		
		System.out.println("Rosa é instrutora do curso?");
		System.out.println(java.contemInstrutor(rosa));
		
		System.out.println("\nInstrutores: ");
		System.out.println(java.getInstrutores());
		
		java.removeInstrutor(paola);
		System.out.println("\nRemovendo a instrutora paola: ");
		System.out.println(java.getInstrutores());

	}

}
