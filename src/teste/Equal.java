package teste;
/* 
 * Contrato:
 * Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null.
 * Simetrico: x.equals(y) == true, logo y.equals(x) == true, x e y sendo diferente de null.
 * Transitivo: x.equal(y) == true e y.equals(z) == true, logo x.equals(z) tem que ser true,
 * 				sendo x, y, e z null.
 * Consistente: x.equals(y) sempre tem que retornar o mesmo valor.
 * 	Se x.equals(null) tem que retornar false se qualquer elemento for null.
 * 
 * operador ==:
 * retorna true no caso de tipos primitivos;
 * retorna false no caso de tipos não primitivos(Wrappers) porque esses tipos
 * 			são objetos e nessecita do new para serem criados, sendo assim, objs 
 * 			diferentes. Salvo no caso de atribuição direta atraves do operador
 * 			= entre os dois objs, que neste caso apontarão p/ a mesma instância.
 */
public class Equal {
	
		private String elemento;
		
		public Equal(String elemento) {
			super();
			this.elemento = elemento;
		}

		/*@Override
		public boolean equals(Object o){
			if (o == null) return false;
			if (this == o) return true;
			if (this.getClass() != o.getClass()) return false;
			Equal outroObj = (Equal) o;
			if (this.elemento == null) {
				return false;
			} else {
				return this.elemento.equals(outroObj.getElemento());
			}
		}*/
		
		public void setElemento(String elemento) {
			this.elemento = elemento;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((elemento == null) ? 0 : elemento.hashCode());
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
			Equal other = (Equal) obj;
			if (elemento == null) {
				if (other.elemento != null)
					return false;
			} else if (!elemento.equals(other.elemento))
				return false;
			return true;
		}

		public String getElemento(){
			return this.elemento;
		}
}
