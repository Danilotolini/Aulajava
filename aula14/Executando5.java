package aula14;
public class Executando5 {
    public static void main(String[] args) {
        ExemploFuncional1 funcao = (n, i, s) -> 
        System.out.println(
         "Funcionario " + n + " recebe sal�rio " + s);
        
        funcao.exibeDados("Manuel", 45, 5500.15);
    }
}
