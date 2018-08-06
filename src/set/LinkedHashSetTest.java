package set;

import java.util.LinkedHashSet;
import java.util.Set;

import util.Recibo;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		Set<Recibo> recibos = new LinkedHashSet<>();
		
		recibos.add(new Recibo(001));
		recibos.add(new Recibo(004));
		recibos.add(new Recibo(002));
		recibos.add(new Recibo(003));
		
		//mantem a ordem
		recibos.forEach(r -> System.out.println(r.toString()));
	}
}
