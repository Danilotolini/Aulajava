package aula14;
public class Executando2Alt {
    public static void main(String[] args) {

        ExemploFuncional2Alt funcao = (t) -> 
        System.out.println(t);
               
        funcao.exibeDados("Tricolor o Maior campe�o mundial do Brasil!");
        funcao.exibeDados("Tricolor o Maior campe�o das Am�ricas do Brasil!");
        funcao.exibeDados("Tricolor o Melhor do Brasil!");
    }
}
