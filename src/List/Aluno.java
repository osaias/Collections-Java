package List;


public class Aluno {
	private String nome;
	private int pontos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public String toString() {
		return this.nome; 
	}
	
	public boolean equals(Object o) {
		Aluno outro = (Aluno)o;
		return this.nome.equals(outro.nome);
	}
}
