package Equals;

public class ExemploEquals {

	public static void main(String[] args) {
		Pessoa a = new Pessoa("Rodrigo", 23);
		Pessoa b = new Pessoa("Claudio", 20); 
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + a.equals(b)); 
		
		a.nome = b.nome;// Nomes iguais, mas objetos diferentes 
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + a.nome.equals(b.nome)); 
		
		a = b; //Objetos iguais
		System.out.println("HashCode() de A (Rodrigo) " + a.hashCode() + 
        		"\nHashCode() de B (Claudio) " + b.hashCode() + "\n");
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (
				a.hashCode() == b.hashCode()));
	}

}
