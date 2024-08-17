package Laboratorios.Cap_09;
public class RG {
	private int numero;
	private String dataNasc;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public RG(int numero, String dataNasc) {
		super();
		setNumero(numero);
		setDataNasc(dataNasc);
	}	
	public RG(String dataNasc,int numero) {
		super();
		setNumero(numero);
		setDataNasc(dataNasc);
	}	
	
}
