package aula05.carro;
public class Cap5_Lab2 {
	public static void main(String[] args) {		
		Garagem g = new Garagem();
		
		g.carroPasseio = new Carro();
		g.carroPasseio.cor = "vermelho";
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.potencia = 2.3;
		
		g.carroUtilitario = new Carro();
		g.carroUtilitario.cor = "branco";
		g.carroUtilitario.modelo = "Renault Boxer";
		g.carroUtilitario.potencia = 3.8;
		
		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.getModelo());
		System.out.println("Pot�ncia: " + g.carroPasseio.potencia);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Carro Utilit�rio: ");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.getModelo());
		System.out.println("Pot�ncia: " + g.carroUtilitario.potencia);
		
	}

}