package aula15;

import java.util.Objects;
public class Pessoa {

	String nome;
	int idade;

	Pessoa(String n, int i){
		nome = n;
		idade = i;
	}
	public boolean equals(Object o){
		//Devemos verificar se o objeto "o" eh uma instancia da classe Pessoa
		if (o instanceof Pessoa){
			//Devemos fazer o cast de Object para Pessoa
			Pessoa p = (Pessoa) o;
			if (this.getNome().equals(p.getNome())
					&& this.getIdade() == p.getIdade()){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}	
	}
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
	
	
	public int hashCode() {
		return Objects.hash(nome, idade);		
	}
}
