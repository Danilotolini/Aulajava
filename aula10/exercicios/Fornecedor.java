package aula10.exercicios;

public class Fornecedor {
	private String nome, fone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Fornecedor(String nome, String fone) {
		super();
		this.nome = nome;
		this.fone = fone;
	}
	public Fornecedor() {}

	@Override
	public String toString() {
		return "Fornecedor [Nome= " + nome + ", Fone= " + fone + "]";
	}
	
	
}
