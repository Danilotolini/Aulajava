package arraylist2;

import java.util.ArrayList;

public class TesteArrayList {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Joao", 35);
		Funcionario func2 = new Funcionario("Gerson", 42);
		Funcionario func3 = new Funcionario("Renato", 27); 

		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		imprimeFuncionarios(funcionarios);		
		System.out.println("O funcionario 1 serah removido...");
		Funcionario funcRemovido = 
				(Funcionario) funcionarios.remove(1);

		System.out.println("Funcionario removido: " + funcRemovido);		

		imprimeFuncionarios(funcionarios);
	}	
	private static void imprimeFuncionarios (ArrayList<Funcionario> funcionarios){
		Funcionario func;
		System.out.println("Qtde de funcionarios: " + funcionarios.size());
		for (int nCont = 0; nCont < funcionarios.size(); nCont++){
			func = (Funcionario) 								funcionarios.get(nCont);
			System.out.println(nCont + ": \t" + func);
		}
		System.out.println("--------FIM---------");
	}	
}



