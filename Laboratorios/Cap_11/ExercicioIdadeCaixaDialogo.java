package Laboratorios.Cap_11;
import java.util.Calendar;

import javax.swing.JOptionPane;
public class ExercicioIdadeCaixaDialogo {
    public static void main(String[] args) {
        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Digite o ano de seu nascimento: ");
            String anoStr = JOptionPane.showInputDialog(
            		"Digite o ano de seu nascimento: ");
            Calendar data = Calendar.getInstance();
            
            int ano = Integer.parseInt(anoStr);
            int idade = data.get(data.YEAR) - ano;
            
            JOptionPane.showMessageDialog(null, 
            		"Você possui " + idade + " anos de idade.");

        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inválido");
        }
    }
}
