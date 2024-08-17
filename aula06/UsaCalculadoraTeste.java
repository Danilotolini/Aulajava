package aula06;
import javax.swing.JOptionPane;
public class UsaCalculadoraTeste {
	public static void main(String args[]){
		CalculadoraTeste ct = new CalculadoraTeste();
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação a realizar: \n"
				+ "1-Soma \n2-subtração \n3-multiplicação \n4-divisão"));
		if(escolha==1) {
			double res = ct.somarNumero();
			System.out.println("Resultado = " + res);
		}
		else if(escolha==2){
			double res = ct.subtrairNumero();
			System.out.println("Resultado = " + res);
		}
		else if(escolha==3){
			double res = ct.multiplicarNumero();
			System.out.println("Resultado = " + res);
		}
		else if(escolha==4){
			double res = ct.dividirNumero(
					Double.parseDouble(JOptionPane.showInputDialog("Digite o denominador")), 
					Double.parseDouble(JOptionPane.showInputDialog("Digite o denominador")));
			System.out.println("Resultado = " + res);
		}
	}
}
