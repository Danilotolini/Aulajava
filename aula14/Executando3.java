package aula14;
public class Executando3 {

    public static void main(String[] args) {

        ExemploFuncional3 funcao1 = d -> Math.sqrt(d);       
        double result = funcao1.execute(144);
        System.out.println("Resultado: " + result);
        
        ExemploFuncional3 funcao2 = d -> Math.pow(d,3);
        result = funcao2.execute(2);
        System.out.println("Resultado: " + result);
    }
}