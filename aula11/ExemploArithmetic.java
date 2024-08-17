package aula11;

import javax.swing.JOptionPane;

public class ExemploArithmetic {
    public static void main(String[] args) {
        try {
            int valorTotal = 25;
            int quantidadePessoas = Integer.parseInt(
            	JOptionPane.showInputDialog("Digite a quantidade:"));
            int rateio = valorTotal / quantidadePessoas;
            System.out.println("Valor do rateio: " + rateio);
        } catch (ArithmeticException e) {
            System.out.println("Operação inválida.");
            e.printStackTrace();
        }
    }
}
