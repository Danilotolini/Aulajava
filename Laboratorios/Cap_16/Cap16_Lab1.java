package Laboratorios.Cap_16;
import java.io.*;
import javax.swing.JOptionPane;
public class Cap16_Lab1 {
    public static void main(String[] args) {
        escrever("Capitulo 16 \nLaboratorio 1");
        ler();
       
        String nomeArquivo = JOptionPane.showInputDialog(
        		"Digite caminho e o nome do arquivo:");
        ler(nomeArquivo);
    }

    private static void ler(String arquivo) {
    	try {
    		System.out.println();
            FileInputStream arquivoLido = new FileInputStream(arquivo);
            DataInputStream dados = new DataInputStream(arquivoLido);
            
            while (dados.available() > 0) {
                char c = dados.readChar();
                System.out.print(c);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }		
	}

	private static void escrever(String texto) {
        try {

            FileOutputStream arquivo = new FileOutputStream("Cap16_Lab1.txt");
            DataOutputStream dados = new DataOutputStream(arquivo);
            
            dados.writeChars(texto);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    private static void ler() {        
        try {
            FileInputStream arquivo = new FileInputStream("Cap16_Lab1.txt");
            DataInputStream dados = new DataInputStream(arquivo);
            
            while (dados.available() > 0) {
                char c = dados.readChar();
                System.out.print(c);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
