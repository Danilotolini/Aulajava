package Laboratorios.Cap_11.extras;

import java.time.Year;
import java.util.Calendar;

public class Pessoa extends AnoInvalidoException{
	private String nome;
	private int anoNasc, idade;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		this.idade = anoAtual - getAnoNasc();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) throws AnoInvalidoException{		
		if(anoNasc<1900) {
			AnoInvalidoException e = new AnoInvalidoException(
					"O ano de nascimento deve estar entre 1900 e 2024");
			throw e;
		}
		else
			this.anoNasc = anoNasc;
	}
	public Pessoa(String nome, int anoNasc) throws AnoInvalidoException {
		super("Ano de nascimento validado!");
		this.nome = nome;
		setAnoNasc(anoNasc);
		setIdade(anoNasc);
	}
	@Override
	public String toString() {
		return "Nome = " + nome + ", nascido em " + anoNasc 
				+ ", idade: " + this.idade;
	}	
	
}