package aula06;

public class ExemploChamadaDeMetodo {
	static void executarTarefaAA(){
		System.out.println("Executando tarefa AA");
	}
	
	static void executarTarefaBB(){
		System.out.println("Executando tarefa BB");
		executarTarefaAA();
	}
	
	public static void main(String args[]){
		System.out.println("\"main\", � o ponto de partida");
		executarTarefaBB();
	}
}
