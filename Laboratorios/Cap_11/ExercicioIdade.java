package Laboratorios.Cap_11;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class ExercicioIdade {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o ano de seu nascimento: ");
            String anoStr = scanner.nextLine();
            int ano = Integer.parseInt(anoStr);
//            Date data = new Date();
//            int anoAtual = data.getYear() + 1900;           
            
            Calendar dataNova = Calendar.getInstance();
            int anoAtual = dataNova.get(dataNova.YEAR);
            
            int idade = anoAtual - ano;
            System.out.println("Você possui " + idade + " anos de idade.");
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inválido");
        }
    }
}
