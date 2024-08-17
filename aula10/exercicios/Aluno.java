package aula10.exercicios;

public class Aluno extends Pessoa{
	private int ra;
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public Aluno(int ra, String nome ) {
		super.setNome(nome);
		setRa(ra);		
	}
	@Override
	public String toString() {
		return "Aluno [Ra=" + ra + ", Nome=" + super.getNome() + "]";
	}	
}
