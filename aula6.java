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
//------------------------------------------------------------------------------------------------------------------------------------------ 
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
