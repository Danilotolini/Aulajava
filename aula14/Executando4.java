package aula14;
public class Executando4 {
    public static void main(String[] args) {
        ExemploFuncional1 funcao = (n, i, s) -> {
            if (i < 18) {
                System.out.println("Funcionario não pode "
                		+ "ser menor de idade!");
            } else {
                System.out.println("Funcionario " 
            + n.toUpperCase()
                    + " recebe salário " + s);
            }
        };
        
        funcao.exibeDados("Celso", 25, 5500.15);
        funcao.exibeDados("Kleber", 18, 9500.15);
        funcao.exibeDados("Ingrid", 18, 10500.15);
        funcao.exibeDados("Gabriel", 19, 14500.15);
        funcao.exibeDados("Lucas", 17, 14500.15);
    }
}
