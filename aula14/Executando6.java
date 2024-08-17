package aula14;
public class Executando6 {
    public static void main(String[] args) {
        ExemploFuncional4 funcao = val -> {
            return val * 4;
        };        
        System.out.println(funcao.quadruplo(8));
    }
}