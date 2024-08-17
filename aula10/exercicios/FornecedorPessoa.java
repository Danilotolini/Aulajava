package aula10.exercicios;

public class FornecedorPessoa extends Fornecedor{
	private String cpf, rg;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public FornecedorPessoa(String nome, String fone, String cpf, String rg) {
		super(nome, fone);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "FornecedorPessoa [ Nome= " + super.getNome()
		+ ", Fone= " + super.getFone() 
		+ ", cpf= " + cpf 
		+ ", rg= " + rg
				+ "]";
	}
	
	
	
}
