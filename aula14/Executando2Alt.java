package aula14;
public class Executando2Alt {
    public static void main(String[] args) {

        ExemploFuncional2Alt funcao = (t) -> 
        System.out.println(t);
               
        funcao.exibeDados("Tricolor o Maior campeão mundial do Brasil!");
        funcao.exibeDados("Tricolor o Maior campeão das Américas do Brasil!");
        funcao.exibeDados("Tricolor o Melhor do Brasil!");
    }
}
