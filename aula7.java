package controller;

import model.Contatos;

public class Contatoscontroller {
	public void listarContatos(Contatos c) {  
		System.out.println("Nome: " + c.getNome() + "Idade: " + c.getIdade());
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
