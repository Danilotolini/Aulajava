package aula10.exercicios;

import javax.swing.JOptionPane;

public class Utilitaria {
	public static boolean validarCPF(String cpf){
		//568.340.348-03
//		String cpf = limparCampo(cpf1);
		
		boolean valida=false;
		String digitoCPF1= cpf.substring(cpf.length()-2);
		
		String cpfInvalido = "";
		for(int i=0; i<10; i++)
		{
			for(int n=0; n<12 ; n++)
			{
				cpfInvalido +=i;
			}			
		}
		
		if(cpfInvalido.contains(cpf))
		{
			JOptionPane.showMessageDialog(null, "CPF Inválido!!!", "Validação de CPF: ", 
					JOptionPane.WARNING_MESSAGE);
			return false;						
		}
		else
		{
			int soma1=0;
			int soma2=0;
			int val1=cpf.length();
			int val2=cpf.length()-1;
			int resto=0;
			int digito1=0;
			int digito2=0;
			
			String digx1="";
			String digx2="";
			
			for(int i=0; i<cpf.length()-1; i++)//calcula o primeiro digito
			{
				String letra = ""+cpf.charAt(i);
				int s = Integer.parseInt(letra);
				soma1 += (val1 * s);
				val1--;
			}
			resto = (soma1%11);
			digito1 = 11-resto;
			if(digito1==10 || digito1==11)
			{
				digx1="0";			
			}
			else
			{
				digx1= ""+digito1;	
			}
			
			for(int i=0; i<cpf.length()-2; i++)//calcula o segundo digito
			{
				String letra = ""+cpf.charAt(i);
				int s = Integer.parseInt(letra);
				soma2 += (val2 * s);
				val2--;
			}
			resto = (soma2%11);
			digito2 = 11-resto;
			if(digito2==10 || digito2==11)
			{
				digx2="0";			
			}
			else
			{
				digx2= ""+digito2;	
			}
			
			String digitos = digx2+digx1;
			
			if(digitos.equalsIgnoreCase(digitoCPF1))
			{
				valida=true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CPF Inválido!!! ", 
						"Validação de CPF: ", JOptionPane.WARNING_MESSAGE);
				return false;
			}		
		}
		return valida;
	}
	
	private static String limparCampo(String texto) {
		String retorno = null;
		for(int i =0 ; i<texto.length(); i++)
			if(texto.charAt(i)=='.' || texto.charAt(i)=='-' || texto.charAt(i)=='/' )
				break;
			else
				retorno += texto.charAt(i);				
		return retorno;
	}

	public static boolean validarRG(String s)	{
//		String s = limparCampo(s1);
		String digitoRG= s.substring(s.length()-1);
		int soma=0;
		int val=s.length();
		int resto=0;
		int digito=0;
		String digx="";
		boolean valida=false;
		
		for(int i=0; i<s.length()-1; i++)
		{
			String letra = ""+s.charAt(i);
			int n = Integer.parseInt(letra);
			soma += (val * n);
			val--;
		}
		resto = (soma%11);
		digito = resto;
		if(digito==10)
		{
			digx="X";			
		}
		else
			
		{
			digx = "" + digito;	
		}
		
		if(digx.equalsIgnoreCase(digitoRG))
		{
			valida = true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "RG Inválido!!!", "Validação de RG: ", JOptionPane.WARNING_MESSAGE);
		}		
		return valida;		
	}	
}


