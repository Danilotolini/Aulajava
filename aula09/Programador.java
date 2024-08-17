package aula09;

public class Programador extends Funcionario {
	// atributos privados
	private String linguagem;
	private String sistemaOperacional;	
	
	public Programador(String nome, String email, 
		String linguagem, String sistemaOperacional) {
		super(nome, email);
		this.linguagem = linguagem;
		this.sistemaOperacional = sistemaOperacional;
	}
	// métodos
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	
	
	@Override
	public String toString() {
		return "Programador [idade=" + idade + ", sexo=" + sexo + ", linguagem=" + linguagem + ", sistemaOperacional="
				+ sistemaOperacional + ", Nome =" + getNome() + ", Email()=" + getEmail() + "]";
	}
	public void imprimirDados(){
		// Os métodos getNome e getEmail são HERDADOS da superclasse Funcionário
		System.out.println("Nome: " + super.getNome());
		System.out.println("Email: " + super.getEmail());
		System.out.println("Linguagem: " + linguagem);
		System.out.println("Sistema Operacional: " + sistemaOperacional);
	}
}
