package aula10.exercicios;
import javax.swing.JOptionPane;
public class CadastraFornecedores {

	public static void main(String[] args) {
		int qtd = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade a cadastrar:"));
			
			Fornecedor f[] = new Fornecedor[qtd];
			
			for (int i = 0; i < qtd; i++) {
				String valores[] = {"FornecedorPessoa","FornecedorEmpresa"};
				Object escolha = JOptionPane.showInputDialog(null, 
					"Qual Pessoa deseja Cadastrar?",
				   "Cadastro de Pessoa", 
				   JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
				if(escolha.equals("FornecedorPessoa")) {
					String cpf, rg;
					
					do {
					 cpf = JOptionPane.showInputDialog("Digite o CPF ");
					}while(!Utilitaria.validarCPF(cpf));
					
					do {
						 rg = JOptionPane.showInputDialog("Digite o RG ");
						}while(!Utilitaria.validarRG(rg));
					
					f[i] = new FornecedorPessoa(
						JOptionPane.showInputDialog(
									"Digite o Nome da Pessoa"),
						JOptionPane.showInputDialog(
								"Digite o Telefone "),
						cpf ,
						JOptionPane.showInputDialog(
								"Digite o RG "));
				}
				else if(escolha.equals("FornecedorEmpresa")) {
					f[i] = new FornecedorEmpresa(
							JOptionPane.showInputDialog(
										"Digite o Nome da Empresa"),
							JOptionPane.showInputDialog(
									"Digite o Telefone "),
							JOptionPane.showInputDialog(
									"Digite o CNPJ "),
							JOptionPane.showInputDialog(
									"Digite a IE "));
					}
			}
			
			for (int i = 0; i < qtd; i++) {
				System.out.println(f[i]);
			}
	}
}
