package aula05;
public class TesteEmpregado {	
	public static void main(String[] args) {
		Empregado emp = new Empregado();
		emp.setEndereco("Rua Cubatão, 726, Paraíso");
		emp.setIdade(40);
		
		System.out.println(emp.mostrar());
	}

}