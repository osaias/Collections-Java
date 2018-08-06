package util;

/**
 * 
 * @author osaias.saraiva
 * 
 * Classe que representa um recibo.<br>
 * Recebe  o numero como parametro no construtor. 
 * Tambem é um comparable para ser utilizado com <Strong>TreeSet</strong>
 */
public class Recibo implements Comparable<Recibo>{

	private int numero;
	private String recebedor;
	private String pagador;
	private double valor;

	public Recibo(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public String getRecebedor() {
		return recebedor;
	}

	public void setRecebedor(String recebedor) {
		this.recebedor = recebedor;
	}

	public String getPagador() {
		return pagador;
	}

	public void setPagador(String pagador) {
		this.pagador = pagador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recibo other = (Recibo) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public int compareTo(Recibo o) {
		// TODO Auto-generated method stub
		if (this.numero < o.numero) {
			return -1;
		};
		
		if (this.numero > o.numero) {
			return 1;
		};
		
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Recibo nº " + this.numero;
	}

}
