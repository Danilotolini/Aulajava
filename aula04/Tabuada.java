package aula04;
import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String args[]){
		int num = Integer.parseInt(JOptionPane.showInputDialog(
		"Digite o número que deseja saber a Tabuada"));		
		for(int a = 0 ; a < 11 ; a++){
			System.out.println(num + " X " + a + " = " + (num*a));
		}
	}
}

/*
public class Tabuada {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	int num;

	System.out.println("Digite um número: ");
	num = teclado.nextInt();

	int multiplicador = 0;
	while (multiplicador <= 10) {
		int resultado = num * multiplicador;
		System.out.println(num + " x " + multiplicador + " = " + (resultado));
		multiplicador++;

		teclado.close();
	}
}
}
*/