package Laboratorios.Cap_15;
import java.util.ArrayList;
public class Cap15_Lab2 {
    public static void main(String[] args) {
        ArrayList<Estudante> estudanteList = new ArrayList<>();
        estudanteList.add(new Estudante("Joana", 8.5, 8.5));
        estudanteList.add(new Estudante("Antonio", 6.0, 9.0));
        estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
        estudanteList.add(new Estudante("Ricardo", 7.0, 6.0));
        estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));

        //cálculo da média
        estudanteList.forEach(e -> 
          e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));

        System.out.println(String.format("%-20s %-4s %-4s %-4s", 
        		"Nome","Mate","Port", "Média"));
        
        estudanteList.forEach(System.out::println);
    }
}
