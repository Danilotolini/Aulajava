package Laboratorios.Cap_09;


public abstract class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private RG rg;
	
	public Pessoa(String nome, int idade, char sexo, RG rg) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setRg(rg);
	}

	public abstract void falar(String fala);
	
	public abstract void mostrarDados();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public RG getRg() {
		return rg;
	}

	public void setRg(RG rg) {
		this.rg = rg;
	}
}
