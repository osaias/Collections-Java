package teste;
import java.util.ArrayList;
import java.util.LinkedList;

import util.Aluno;

public class TestePerfomance {

	public static void main(String[] args) {
		
		ArrayList<Aluno> listaArray = new ArrayList<Aluno>();
		LinkedList<Aluno> listaLigada = new LinkedList<Aluno>();
		ListaDeAlunos listaCriada = new ListaDeAlunos();
		long numeroElementos = 100000;
		Aluno a1 = new Aluno("Jó", 23658987);
		
		//ADICIONA NO COMEÇO
		long inicio = System.currentTimeMillis();
		for (long i = 0; i < numeroElementos; i++) {
			listaArray.add(0, a1);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Adiciona no comeco do ArrayList: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaLigada.addFirst(a1);
		}
		fim = System.currentTimeMillis();
		System.out.println("Adiciona no comeco do LinkedList: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaCriada.adicionaNoComeco(a1);
		}
		fim = System.currentTimeMillis();
		System.out.println("Adiciona no comeco do ListaDeAlunos: " + (fim - inicio) / 1000.0);
		
		//PERCORRENDO
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaArray.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("\nPercorrendo no ArrayList: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaLigada.get(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Percorrendo no LinkedList: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaCriada.pega(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Percorrendo no ListaDeAlunos: " + (fim - inicio) / 1000.0);
		
		//REMOVENDO DO COMEÇO
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaArray.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("\nRemovendo no ArrayList: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaLigada.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Removendo no LinkedList: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroElementos; i++) {
			listaCriada.removeNoComeco();
		}
		fim = System.currentTimeMillis();
		System.out.println("Removendo no ListaDeAlunos: " + (fim - inicio) / 1000.0);
	}

}
