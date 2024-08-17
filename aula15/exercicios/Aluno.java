package aula15.exercicios;

public class Aluno {
	String nome;
	double nota;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	public Aluno() {
	}
	@Override
	public String toString() {
		return "Nome=" + nome + ", Nota=" + nota;
	}
}
