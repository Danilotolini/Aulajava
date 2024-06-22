package exercicio2;

public class Alunos {
 private String ra; 
public String getra() {
	return ra;
}
public void setNome(String ra) {
	this.ra = ra;
}
public Alunos(String ra) {
	super();
	this.ra = ra;
}
public Alunos() {
	super();
}
@Override
public String toString() {
	return "Aluno [Ra =" + ra + "]";
}
}
