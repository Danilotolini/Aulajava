package exercicio3;
public class Aluno implements Comparable{
	private String nome;
	private long RA;

	public Aluno(String nome, long RA){
		this.nome = nome;
		this.RA = RA;
	}
	public String getNome() {		
		return nome;	
	}
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public long getRA() {
		return RA;		
	}
	public void setRA(long ra) {
		RA = ra;
	}

	public boolean equals(Object obj){
		if (obj instanceof Aluno){
			Aluno aluno = (Aluno) obj;			
			if(this.getNome().equalsIgnoreCase(aluno.getNome())
					&& this.getRA() == aluno.getRA()){
				return true;
			}
			else{
				return false;
			}
		}
		else
			return false;
	}
	public int compareTo(Object obj){
		Aluno aluno = (Aluno) obj;
		int resp = this.getNome().compareTo(aluno.getNome());
		if (resp != 0){	return resp;	
		}
		else{
			if (this.getRA() < aluno.getRA()){
				return -1;		
			}
			else if (this.getRA() > aluno.getRA()){
				return 1;			
			}
			else{
				return 0;	
			}		
		}	
	}
	public int hashCode(){
		return (int)this.RA + this.getNome().hashCode();
	}
	public String toString(){
		String aluno = "nome: " + this.getNome() + "\n" + "RA: " + 		this.getRA();
		return aluno;	
	}	
}