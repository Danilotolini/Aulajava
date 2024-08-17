package Laboratorios.Cap_04;

import javax.swing.JOptionPane;

public class Cap4_Primos 
{
	public static void main (String args[])
	{
		int numero = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite um número:"));
		int divisoes = 0;
		for(int i = 1; i <= numero; i++) //verifica os divisores
		{
			if(numero % i == 0)
				divisoes++;
		}
		
		if(divisoes > 2 || numero == 0 || numero == 1)
			System.out.println(numero + " não é um número primo");
		else
			System.out.println(numero + " é um número primo");
	}
}