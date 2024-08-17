package aula14;
public class ExecutandoLambda {
    public static void main(String[] args) {
        /* Implementa a operacao a ser realizada atraves 
         * de uma expressao lambda */
        OperacaoAritmetica operacao = (x, y) -> x + y;

        /* Executa a operacao sobre dois valores double 
         * e obtem o resultado */
        double result = operacao.execute(15.8, 8.3);
        
        System.out.println(result);
    }
}
