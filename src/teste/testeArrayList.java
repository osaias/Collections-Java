package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import colecoes.Produto;

class ProdutoNome implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		/*Double d1 = p1.getPreco();
		Double d2 = p2.getPreco();  // Se fosse por preço.
		return d1.compareTo(d2);*/
		
		return p1.getDescricao().compareTo(p2.getDescricao());
	}
	
}


public class testeArrayList {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		//criando produtos
		Produto laptop = new Produto(14,"Notebook Acer", 2045.50);
		Produto celular = new Produto(1,"Smartphone Samsung galaxy", 745.50);
		Produto tv = new Produto(145,"tv Smart LG", 2999.50);
		Produto radio = new Produto(102,"Walkman Cougar", 100.0);
		Produto teclado = new Produto(987,"teclado multilaser",45.50);
		Produto camera = new Produto(59,"camera nikon", 239.43);
		Produto mesa = new Produto(53,"Mesa Itatiaia", 699.0);
		Produto livro = new Produto(452,"Livro Era...", 14.50);
		Produto sapato = new Produto(128,"Sapato Preslon", 139.50);
		Produto caneta = new Produto(258,"caneta Bic", 1.50);
		Produto macarrao = new Produto(586,"Macarrão Adriar", 2.39);
		
		//Adicionando produtos
		produtos.add(laptop);
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(radio);
		produtos.add(mesa);
		produtos.add(camera);
		produtos.add(caneta);
		produtos.add(teclado);
		System.out.println("Lista de Produtos: \n" + produtos + "\n");
		
		//Ordenando a lista usando o compareTo()
		Collections.sort(produtos);
		System.out.println("Lista de Produtos Ordenados por id: \n" + produtos + "\n");
		
		//Ordenando a lista usando o comparetor
		Collections.sort(produtos, new ProdutoNome());
		//a organização é CaseSensitive
		System.out.println("Lista de Produtos Ordenados nome: \n" + produtos + "\n");
	}

}
