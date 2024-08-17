package Laboratorios.Cap_04;
import javax.swing.JOptionPane;
public class Cap4_Lab2 
{
	public static void main(String[] args) 
	{		
		String mes = JOptionPane.showInputDialog(
				"Digite o nome do mês. Ex.: Março:");
		
		switch(mes.toLowerCase()) 
		{
			case "janeiro": case "março": case "maio": case "julho":
			case "agosto": case "outubro": case "dezembro":
				System.out.println("O mês escolhido tem 31 dias");
				break;
				
			case "fevereiro":
				System.out.println("O mês escolhido tem 28 ou 29 dias ");
				break;			
				
			case "abril": case "junho": case "setembro": case "novembro":
				System.out.println("O mês escolhido tem 30 dias");
				break;			
				
			default:
				System.out.println("O mês passado não existe!");
		}		
	}
}
