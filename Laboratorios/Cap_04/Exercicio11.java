package Laboratorios.Cap_04;
import javax.swing.JOptionPane;
public class Exercicio11 
{

	public static void main(String[] args) 
	{
		int a= Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		int i=1, divisores=0;
		for ( ; i<=a ; ++i) 
		{
			System.out.println(i);
			if (a%i==0) //   3/1 sobra 0 e encerra.
			{
				divisores++;
				//break; //ao inv�s disto crie uma vari�vel para saber quantas vezes o n�mero foi dividido e o resto foi 0.
			}			
		}		
		 if(divisores>2)
			System.out.print("N�o � primo !! ");
		else
			System.out.print("� primo !! ");
	}
}