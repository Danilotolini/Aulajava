package exercicio3;
public class RG {
	private int numero;
	private String dataNasc;	
	public RG(int numero, String dataNasc){
		setNumero(numero);
		setDataNasc(dataNasc);
	}	
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
}