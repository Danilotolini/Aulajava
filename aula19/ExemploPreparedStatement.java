package aula19;
import java.sql.*;

import javax.swing.JOptionPane;
public class ExemploPreparedStatement {
    public static void main(String[] args) {        
        try {
            Connection cn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/impacta", "root", "Imp@ct@");

            String nome, cargo;
            double salario;
            
            nome = JOptionPane.showInputDialog("Digite o nome do Funcionário");
            cargo = JOptionPane.showInputDialog("Digite o Cargo do Funcionário");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do Funcionário"));
            
            PreparedStatement ps = cn.prepareStatement(
            	"INSERT INTO funcionarios (funcionariosNome, funcionariosCargo, "
            	+ "funcionariosSalario) VALUES (?, ?, ?)");
            
            ps.setString(1, nome);
            ps.setString(2, cargo);
            ps.setDouble(3, salario);
            
            ps.executeUpdate();

            System.out.println("Funcionário cadastrado com sucesso.");

            ps.close();
            cn.close();
            System.out.println("Conexão encerrada.");
            
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}
