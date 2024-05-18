package aula12;

import javax.swing.JOptionPane;

public class ExemploNumberFormat {

    public static void main(String[] args) {

       	 try {

            String texto = JOptionPane.showInputDialog("Digite a idade:");
            int idade = Integer.parseInt(texto);

            System.out.println("Parabéns pelos seus " + idade + " anos de idade.");

        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
            e.printStackTrace();
        }
    }
}