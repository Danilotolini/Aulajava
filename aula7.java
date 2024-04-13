package controller;

import model.Contatos;

public class Contatoscontroller {
	public void listarContatos(Contatos c) {  
		System.out.println("Nome: " + c.getNome() + "\nIdade: " + c.getIdade());
	}
}
===================================================================================================================================== 
  package model;

import controller.Contatoscontroller;

public class Contatos {
	private String nome;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void listarContato(Contatos c) {
		Contatoscontroller cc = new Contatoscontroller();	
		cc.listarContatos(c);
	}
}
==================================================================================================================================== 
package view;

import model.Contatos;

public class Contatoslista { 
	public static void main(String[] args) {
			Contatos c1 = new Contatos();		
			c1.setNome("Marcos");
			c1.setIdade(58);
			c1.listarContato(c1);
			Contatos c2 = new Contatos();		
			c2.setNome("Marcela");
			c2.setIdade(25);
			c2.listarContato(c2);
		}
	} 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
//PARA ESCOLHER O QUANTO DE CONTATOS ADICIONAR Adicione este codigo a classe Contatoslista  
package view;

import javax.swing.JOptionPane;

import model.Contatos;

public class Contatoslista { 
	public static void main(String[] args) {
			int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a cadastrar")); 
			Contatos contatos[] = new Contatos[qtd]; 
			
			for(int i=0; i < contatos.length; i++) { 
				String nome = JOptionPane.showInputDialog("Digite o nome"); 
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")); 
				Contatos c = new Contatos(); 
				c.setNome(nome); 
				c.setIdade(idade); 
				contatos[i] = c; 
			}  
			for(int i=0; i < contatos.length; i++) {  
				contatos[i].listarContato(contatos[i]);
			}
		}
	}  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
public class Calculadora {
	// M�todos criados durante o Cap 07 e Lab 1:
	public int somar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public int subtrair (int valor1, int valor2) {
		int resultado = valor1 - valor2;
		return resultado;
	}
	
	public int multiplicar (int valor1, int valor2) {
		int resultado = valor1 * valor2;
		return resultado;
	}
	
	public int dividir (int valor1, int valor2) {
		int resultado = valor1 / valor2;
		return resultado;
	}
	
	// M�todos sobrecarregados criados no Lab 2
	public double subtrair(double valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair(int valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair(double valor1, int valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
} 
==================================================================================================================================================
public class Cap6_Lab2 {
	public static void main(String[] args) {		
		Calculadora calc = new Calculadora();
		System.out.println("Métodos subtrair sobrecarregados:");
		System.out.println("Chamando a versão de subtrair com "
				+ "2 double: " + calc.subtrair(6.2, 3.1));
		System.out.println("Chamando a versão de subtrair com "
				+ "1 double e um int: " + calc.subtrair(6.2, 2));
		System.out.println("Chamando a versão de subtrair com "
				+ "1 int e um double: " + calc.subtrair(6, 3.2));		
	}
}
