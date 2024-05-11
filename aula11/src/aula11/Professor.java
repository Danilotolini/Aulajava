package aula11;

public class Professor extends Pessoa {
	private int rgf; 
	public int getRgf() {
		return rgf;
	}
	public void setRgf(int rgf) {
		this.rgf = rgf;
	}
	public Professor(int rgf, String nome) {
		setRgf (rgf);
	}
	@Override
	public String toString() {
	return "Professor [Rgf= " + rgf + ", Nome= " + super.getNome() + "]";
	}
}
