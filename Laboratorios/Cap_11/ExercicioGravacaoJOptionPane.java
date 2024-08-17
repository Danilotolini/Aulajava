package Laboratorios.Cap_11;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class ExercicioGravacaoJOptionPane {
    public static void main(String[] args) {
        try {           
            String texto = JOptionPane.showInputDialog( "Digite uma frase:");            
            PrintWriter writer = new 
            	PrintWriter("C:\\Users\\sabado\\Documents\\doc1.txt");
            writer.println(texto);
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Frase gravada com sucesso.");

        } catch (IOException ioe) {
            System.out.println("Falha ao gravar as informações digitadas.");
        }
    }
}
