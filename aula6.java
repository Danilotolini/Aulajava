/*
package aula6;

import javax.swing.JOptionPane;

public class Funcionario {
	private String nome, sobrenome, cargo; 
	private	float salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) { 
		if(salario>1500)
		this.salario = salario; 
		else 
			JOptionPane.showMessageDialog(null, "O salário deve ser maior que o valor do salario minimo");
	}  
	
	
}
*/
/* 
package aula6;

public class Carro {
	private String modelo; 
	private double potencia; 
	private String cor; 
	
	public void setmodelo(String modelo) { 
		this.modelo = modelo; 
	} 
	
	public String getmodelo() {
	return modelo; 
} 
	public void setpotencia(double potencia) { 
		this.potencia = potencia;
	} 
	
	public double getpotencia() { 
		return potencia;
	} 
	
	public void setcor(String cor) { 
		this.cor = cor;
	} 
	
	public String getcor() { 
		return cor;
	}
}
//===========================================================================================================================================
package aula6;

import javax.swing.JOptionPane;

public class modeloscarros{
	public static void main(String[] args) { 
		Carro carroPasseio = new Carro(); 
		carroPasseio.setcor(JOptionPane.showInputDialog("Insira a cor")); 
		carroPasseio.setmodelo(JOptionPane.showInputDialog("Insira o modelo")); 
		carroPasseio.setpotencia(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da potencia"))); 	 
		
		Carro carroUtilitario = new Carro(); 
		carroUtilitario.setcor(JOptionPane.showInputDialog("Insira a cor")); 
		carroUtilitario.setmodelo(JOptionPane.showInputDialog("Insira o modelor")); 
		carroUtilitario.setpotencia(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da potencia"))); 	 
		System.out.println("Carro de Passeio: " + "\nCor: " + carroPasseio.getcor() + "\nModelo: " + carroPasseio.getmodelo() + 
				"\nPotencia: " + carroPasseio.getpotencia() + "\n---------------------------------------------------"); 
		
		System.out.println("Carro de Passeio: " + "\nCor: " + carroUtilitario.getcor() + "\nModelo: " + carroUtilitario.getmodelo() + 
				"\nPotencia: " + carroUtilitario.getpotencia());
	}
}
*/
/* 
package aula05.lab.cap5Lab2.carro;

public class Garagem {
	private Carro carroPasseio = new Carro();
	private Carro carroUtilitario = new Carro();
	public Carro getCarroPasseio() {
		return carroPasseio;
	}
	public void setCarroPasseio(Carro carroPasseio) {
		this.carroPasseio = carroPasseio;
	}
	public Carro getCarroUtilitario() {
		return carroUtilitario;
	}
	public void setCarroUtilitario(Carro carroUtilitario) {
		this.carroUtilitario = carroUtilitario;
	}
	
	
}

//=============================================================================================================================================
package aula05.lab.cap5Lab2.carro;
public class Cap5_Lab2 {
	public static void main(String[] args) {		
		
		Carro c = new Carro();
		
		c.setCor("vermelho");
		c.setModelo("VW Jetta");
		c.setPotencia(2.3);
		
		Garagem g = new Garagem();		
		g.setCarroPasseio(c);
		
		Carro c1 = new Carro();
		
		c1.setCor("branco");
		c1.setModelo("Renault Boxer");
		c1.setPotencia(3.8);
		
		g.setCarroUtilitario(c1);
		
		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.getCarroPasseio().getCor());
		System.out.println("Modelo: " + g.getCarroPasseio().getModelo());
		System.out.println("Potência: " + g.getCarroPasseio().getPotencia());
		
		System.out.println("---------------------------------------");
		
		System.out.println("Carro Utilitário: ");
		System.out.println("Cor: " + g.getCarroUtilitario().getCor());
		System.out.println("Modelo: " + g.getCarroUtilitario().getModelo());
		System.out.println("Potência: " + g.getCarroUtilitario().getPotencia());
		
	}

} 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/ 
//PARA O PROJETO IMDB
//LINK AQUIVO ---> https://we.tl/t-B5KAoFRsaB
//CODIGO INICIAL CLASSE FILME
/* 
public class Filmes { 
	private String titulo; 
	private String diretores; 
	private int nota; 
	private int duracao; 
	private int ano; 
	private String generos; 
	private int numdevotos;
	private String url;
	public String getTitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getdiretores() {
		return diretores;
	}
	public void setdiretores(String diretores) {
		this.diretores = diretores;
	}
	public int getnota() {
		return nota;
	}
	public void setnota(int nota) {
		this.nota = nota;
	}
	public int getduracao() {
		return duracao;
	}
	public void setduracao(int duracao) {
		this.duracao = duracao;
	}
	public int getano() {
		return ano;
	}
	public void setano(int ano) {
		this.ano = ano;
	}
	public String getgeneros() {
		return generos;
	}
	public void setgeneros(String generos) {
		this.generos = generos;
	}
	public int getnumdevotos() {
		return numDeVotos;
	}
	public void setnumdevotos(int numDeVotos) {
		this.numDeVotos = numDeVotos;
	}
	public String geturl() {
		return url;
	}
	public void seturl(String url) {
		this.url = url;
	} 
	

}
*/ 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
package aula6;

public class Calculadora {
	double soma(double valor1, double valor2){
		return valor1 + valor2;
	}
	double subtracao(double valor1 , double valor2) { 
		return valor1 - valor2;
	} 
	double multiplicacao(double valor1 , double valor2) { 
		return valor1 * valor2;
}
	double divisao(double valor1 , double valor2) { 
		return valor1 / valor2; 
} 
} 
//=========================================================================================================================================== 
/*
import javax.swing.JOptionPane;

public class UsaCalculadora {
	public static void main(String args[]){
		Calculadora calc = new Calculadora();
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o 1º número:"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o 2º número:"));
		
		System.out.println(num1 + " + " + num2 + " = " 
				+ calc.somar(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " 
				+ calc.subtrair(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " 
				+ calc.multiplicar(num1, num2));
		if(num2==0) {
			JOptionPane.showMessageDialog(null, "Não existe divisão por ZERO. "
					+ "\nFavor digitar novamente.");
			num2 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 2º número:"));
		}
		System.out.println(num1 + " / " + num2 + " = " 
				+ calc.dividir(num1, num2));
	}
} 
*/
