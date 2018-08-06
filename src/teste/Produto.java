package teste;

public class Produto implements Comparable<Produto> {

		private int id;
		private String descricao;
		private double preco;
		
		public Produto(int id, String descricao, double preco) {
			super();
			this.id = id;
			this.descricao = descricao;
			this.preco = preco;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public int getId() {
			return this.id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
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
			Produto other = (Produto) obj;
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return id + "," + descricao + "," + preco + "]\n";
		}

		@Override
		public int compareTo(Produto outro) {
			//return negativo , se this < outro
			//return zero , se this == outro
			//return 1 , se this > outro
			Integer id = this.id;
			return id.compareTo(outro.getId());
		}
		
		
}
