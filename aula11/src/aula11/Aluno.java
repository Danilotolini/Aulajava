package aula11;

public class Aluno extends Pessoa{
	private int ra; 
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public Aluno(int ra, String nome) {
		setRa(ra);
	}
	@Override
	public String toString() {
	return "Aluno [Rgf= " + ra + ", Nome= " + super.getNome() + "]";
	}
	
}
