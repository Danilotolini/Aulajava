package aula05;
public class TesteEmpregado {	
	public static void main(String[] args) {
		Empregado emp = new Empregado();
		emp.setEndereco("Rua Cubat�o, 726, Para�so");
		emp.setIdade(40);
		
		System.out.println(emp.mostrar());
	}

}