package Laboratorios.Cap_06.Cap6_Lab3;
public class Cap6_Lab3 {
	public static void main(String[] args) {
		Aluno joao = new Aluno();
		joao.setNome("Jo�o");
		joao.imprimeAluno();
		System.out.println("Contagem no objeto joao: " + joao.contadorDeAlunos + "\n");
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		maria.imprimeAluno();
		System.out.println("Contagem no objeto maria: " + maria.contadorDeAlunos + "\n");
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		marcos.imprimeAluno();
		System.out.println("Contagem no objeto marcos: " + marcos.contadorDeAlunos + "\n");
	
		// impress�o usando a refer�ncia est�tica correta:
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
		
	}

}
