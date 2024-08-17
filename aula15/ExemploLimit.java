package aula15;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ExemploLimit {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
        lista.add(new Funcionario(1045, "Maria das Dores", "Analista",      6250.0));
        lista.add(new Funcionario(1780, "Joao Ricardo",    "Desenvolvedor", 7100.0));
        lista.add(new Funcionario(5200, "Ana Maria",       "Vendedor",      4100.0));
        lista.add(new Funcionario(3999, "Robson Gusm�o",   "Analista",      6500.0));
        lista.add(new Funcionario(2389, "Eduardo Alves",   "Desenvolvedor", 3200.0));
        
        System.out.println("Três maiores salários");
        lista.stream()
             .sorted(Comparator.comparing(Funcionario::getSalario)
                               .reversed())
             .limit(3)
             .forEach(System.out::println);
    }
}
