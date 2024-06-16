package aula16;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class alunos {    
    public static void main(String[] args) {
        List<alunoprivate> alunosList = new ArrayList<>();
        
        // Cadastro dos alunos
        do {
            alunoprivate novoAluno = new alunoprivate();
            novoAluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
            novoAluno.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:")));
            alunosList.add(novoAluno);
        } while (JOptionPane.showConfirmDialog(null, "Cadastrar Outro?") == JOptionPane.YES_OPTION);
        
        alunosList.forEach(a -> System.out.println(a));
        
        // Loop para exclusão de alunos
        while (!alunosList.isEmpty() && JOptionPane.showConfirmDialog(null, "Excluir um Aluno?") == JOptionPane.YES_OPTION) {
            // Criar uma lista de nomes dos alunos
            String[] nomes = new String[alunosList.size()];
            for (int i = 0; i < alunosList.size(); i++) {
                nomes[i] = alunosList.get(i).getNome();
            }
            
            // Criar um JComboBox com os nomes dos alunos
            JComboBox<String> comboBox = new JComboBox<>(nomes);
            
            // Mostrar o JOptionPane com o JComboBox
            int result = JOptionPane.showConfirmDialog(null, comboBox, "Selecione o aluno a excluir", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String nomeSelecionado = (String) comboBox.getSelectedItem();
                alunosList.removeIf(a -> a.getNome().equalsIgnoreCase(nomeSelecionado));
                System.out.println("Aluno " + nomeSelecionado + " excluído.");
            }
            
            // Verificar se a lista está vazia
            if (alunosList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há mais alunos para excluir.");
                break;
            }
        }
        
        // Mostrar a lista de alunos após a possível exclusão
        alunosList.forEach(a -> System.out.println(a));
    }
}
