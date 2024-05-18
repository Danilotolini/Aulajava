package Exercicio1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioIdade {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o ano de seu nascimento: ");
            String anoStr = scanner.nextLine();
            int ano = Integer.parseInt(anoStr); 
           Date data = new Date(); 
          int anoAtual = data.getYear() + 1900;
            int idade = anoAtual - ano;  
            
            Calendar dataNova = Calendar.getInstance(); 
            anoAtual = dataNova.get(dataNova.YEAR);
            System.out.println("Você possui " + idade + " anos de idade.");
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado inválido");
        }
    }
} 

