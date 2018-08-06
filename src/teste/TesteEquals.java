
package teste;

import colecoes.Equal;

public class TesteEquals {

	public static void main(String[] args) {
		String nome1 = "Joao";
		String nome2 = "Joao";
		String nome3 = new String("Joao");
		String nome4 = nome3;
		System.out.println(nome1 == nome2);//os dois objs estão no mesmo pool.
		System.out.println(nome2 == nome3);// o obj está numa outra instancia.
		System.out.println(nome4 == nome3);// o nome4 apontou para a mesma referencia do nome3
		System.out.println(nome1.equals(nome2));
		System.out.println(nome2.equals(nome3) + "\n");
		
		Equal obj = new Equal("Joao");
		Equal objNull = new Equal(null);
		System.out.println(obj.equals(obj));
		System.out.println(objNull.equals(obj));
		System.out.println(obj.equals(nome1));// classes diferentes.
		System.out.println(obj.equals("Joao"));// classes diferentes.
		System.out.println(obj.equals("cba"));

	}

}

