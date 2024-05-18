package aula12;

public class ExemploNullPointer {
	public static void main(String[] args) {
        try {
            Cliente c = new Cliente();
            c.setNome("Manuel da Silva");

        } catch (NullPointerException e) {
            System.out.println("Variável não instanciada.");
            e.printStackTrace();
        }
    }
}

