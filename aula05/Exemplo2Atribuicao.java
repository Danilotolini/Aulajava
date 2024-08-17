package aula05;

public class Exemplo2Atribuicao {
	public static void main(String args[]){
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.sexo = 'M';
		joao.idade = 45;
		
		maria.sexo = 'F';
		maria.idade = 17;
		
		joao = maria; // atribui��o realizada
		// as vari�veis joao e maria fazem refer�ncia ao mesmo objeto
		System.out.println("Jo�o sexo = " + joao.sexo);
		System.out.println("Jo�o idade = " + joao.idade);
		// qualquer altera��o efetuada no objeto refletir� nas duas vari�veis
		joao.idade = 50;
		System.out.println("Maria idade = " + maria.idade);
		
		joao.sexo = 'M';
		System.out.println("Maria sexo = " + maria.sexo);
	}
}
