package aula15.exercicios;
public class Funcionario {
	private String nome;
	private int codigo;

	public Funcionario(String nome, int codigo) {
		setNome(nome);
		setCodigo(codigo);
	}
	public Funcionario() {}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Funcionario: Nome=" + nome + ", Codigo=" + codigo + "\n";
	} 
}

