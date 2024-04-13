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
