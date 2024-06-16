
public class alunoprivate {
	private String nome;
    private double nota;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public alunoprivate(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public alunoprivate() {
        // Construtor padrão
    }
    
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
