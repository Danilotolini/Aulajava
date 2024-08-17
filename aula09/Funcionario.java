package aula09;

public class Funcionario {
	// atributos
	private String nome;
	private String email;
	int idade;
	char sexo;

	public Funcionario(String nome, String email, int idade, char sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// construtores
	public Funcionario(){}

	public Funcionario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	// métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", "
				+ "email=" + email + ", idade=" + idade 
				+ ", sexo=" + sexo + "]";
	}	
}
