package Laboratorios.Cap_09;


public class Professor extends Pessoa {
	private float salario;
	private String disciplina;
	
	public Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina){
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		setSalario(salario);
		setDisciplina(disciplina);
	}

	public void falar(String fala){
		System.out.println(getNome() + ": " + fala);
	}
	
	public void mostrarDados(){
		System.out.println();
		System.out.println("--- Professor: " + getNome() + " ---");
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Sal�rio: " + getSalario());
		System.out.println("Disciplina: " + getDisciplina());
		System.out.println("N�mero RG: " + getRg().getNumero());
		System.out.println("Data de Nascimento: " + getRg().getDataNasc());
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		String dados = "--- Professor: " + getNome() + " ---"
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nSal�rio: " + getSalario()
		+ "\nDisciplina: " + getDisciplina()
		+ "\nN�mero RG: " + getRg().getNumero()
		+ "\nData de Nascimento: " + getRg().getDataNasc();
		return dados;
	}
	
	
}
