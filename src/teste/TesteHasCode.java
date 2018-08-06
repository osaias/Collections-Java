package teste;

public class TesteHasCode {

	public static void main(String[] args) {
		
		HashCode hc1 = new HashCode("caelum");
		HashCode hc2 = new HashCode("caelum");
		HashCode hc3 = new HashCode("caelul");
		
		System.out.println(hc1.equals(hc2));
		System.out.println(hc1.hashCode() + "  " + hc2.hashCode());
		
		System.out.println(hc1.equals(hc3));
		System.out.println(hc1.hashCode() + "  " + hc3.hashCode());
	}

}
