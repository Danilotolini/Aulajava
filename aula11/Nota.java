package aula11;

public class Nota {
	
	private String aluno;
	private float nota;
	
	public Nota(String aluno, float f) throws NotaInvalidaException{
		this.setAluno(aluno);
		this.setNota(f);
	}
	
	public void setAluno(String aluno){
		this.aluno = aluno;
	}
	
	public String getAluno(){
		return this.aluno;
	}
	
	public void setNota(float nota) throws NotaInvalidaException{
		if(nota < 0 || nota > 10){
			NotaInvalidaException e = new NotaInvalidaException();
			throw e;
		}else{
			this.nota = nota;
		}
	}
	
	public float getNota(){
		return this.nota;
	}
}
