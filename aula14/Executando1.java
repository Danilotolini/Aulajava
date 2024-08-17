package aula14;
public class Executando1 {
    public static void main(String[] args) {
        ExemploFuncional1 funcao = (n, i, s) -> 
        System.out.println(
            "Parabéns " + n.toUpperCase() +
            " pelos seus " + i +
            " anos de vida. Seu novo salário é: " + s);        
        funcao.exibeDados("Manuel", 45, 5500.15);
        funcao.exibeDados("Marcos", 58, 1500.15);
        funcao.exibeDados("Kaue", 18, 15500.15);
        funcao.exibeDados("Santiago", 28, 25500.15);
    }
}
