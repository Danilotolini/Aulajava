package aula05;
/*Ler nome, sexo e idade. Se sexo for feminino 
 * e idade menor que 25. 
 * 	Imprimir o nome da pessoa e a palavra ACEITA. 
 * 	Caso contrario	imprimir NAO ACEITA.
 * 	Imprimir ao final o total de pessoas aceitas.
 * */
import javax.swing.JOptionPane;

public class TrataIdadeAceita {
	public static void main(String[] args) {
		String nome, sexo;
		int idade, resposta=0, totalAceitas=0;
		
		do {
			nome = JOptionPane.showInputDialog(
					"Digite o nome");
			sexo = JOptionPane.showInputDialog(
					"Digite o sexo: \nF-Feminino ou \nM-Masculino");
			idade = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite a idade"));
			if(idade<25 && sexo.toUpperCase().equalsIgnoreCase("F")) {
				System.out.println(nome + " - Aceita");
				totalAceitas++;
			}
			else
				System.out.println("Não Aceita");
			resposta = JOptionPane.showConfirmDialog(null, 
					"Deseja cadastrar outra Pessoa?");
		}while(resposta==0);
		
		
	System.out.println("Total de pessoas aceitas =  " + 
		totalAceitas);
	}
}