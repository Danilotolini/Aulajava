package Laboratorios.Cap_04;
import javax.swing.JOptionPane;
public class Cap4_Lab2 
{
	public static void main(String[] args) 
	{		
		String mes = JOptionPane.showInputDialog(
				"Digite o nome do m�s. Ex.: Mar�o:");
		
		switch(mes.toLowerCase()) 
		{
			case "janeiro": case "mar�o": case "maio": case "julho":
			case "agosto": case "outubro": case "dezembro":
				System.out.println("O m�s escolhido tem 31 dias");
				break;
				
			case "fevereiro":
				System.out.println("O m�s escolhido tem 28 ou 29 dias ");
				break;			
				
			case "abril": case "junho": case "setembro": case "novembro":
				System.out.println("O m�s escolhido tem 30 dias");
				break;			
				
			default:
				System.out.println("O m�s passado n�o existe!");
		}		
	}
}
