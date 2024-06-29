package Exercicio2;

public class Estudante {
 private String name; 
 private double notaMatematica; 
 private double notaPortugues; 
 private double media;
public Estudante(String name, double notaMatematica, double notaPortugues) {
	super();
	this.name = name;
	this.notaMatematica = notaMatematica;
	this.notaPortugues = notaPortugues;
}
public Estudante() {
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getNotaMatematica() {
	return notaMatematica;
}
public void setNotaMatematica(double notaMatematica) {
	this.notaMatematica = notaMatematica;
}
public double getNotaPortugues() {
	return notaPortugues;
}
public void setNotaPortugues(double notaPortugues) {
	this.notaPortugues = notaPortugues;
}
public double getMedia() { 
	return media;
}
public void setMedia(double media) {
	this.media = media; 
	
}
@Override
public String toString() {
	return "Nome = " + name + "\nnota de Matematica = " + notaMatematica 
			+ "\nnota de Português = " + notaPortugues + "\nMedia = " + media;
}

}
