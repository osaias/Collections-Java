package util;
/*
 * se dois objs s�o iguais o hashCode tem que ser igual:
 * 		obj1.equal(obj2) � true, entao obj1.hashCode() == obj2.hashCode();
 * Se o hashCode de dois objs s�o iguais, n�o significa que os dois objs s�o iguais:
 * 		obj1 = caelum    obj2 = caemul;
 */
public class HashCode {
	
	private String nome;
	
	public HashCode(String nome) {
		this.nome =nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		HashCode other = (HashCode) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
