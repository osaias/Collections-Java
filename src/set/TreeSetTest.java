package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import util.Recibo;

public class TreeSetTest {

	public static void main(String[] args) {

		Set<Recibo> recibos = new TreeSet<>();

		recibos.add(new Recibo(001));
		recibos.add(new Recibo(004));
		recibos.add(new Recibo(002));
		recibos.add(new Recibo(003));

		//ordena a coleção
		recibos.forEach(r -> System.out.println(r.toString()));
	}

}
