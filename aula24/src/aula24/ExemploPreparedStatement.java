package aula24;
import java.sql.*;

import javax.swing.JOptionPane;
public class ExemploPreparedStatement {
	 public static void main(String[] args) {
		    try {
	            Connection cn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/impacta", "root", "Imp@ct@");

	            PreparedStatement ps = cn.prepareStatement(
	            	"INSERT INTO funcionarios (funcionariosNome, funcionariosCargo, "
	            	+ "funcionariosSalario) VALUES (?, ?, ?)");
	            ps.setString(1, JOptionPane.showInputDialog("Nome de funcionário(a)"));
	            ps.setString(2, JOptionPane.showInputDialog("Cargo de funcionário(a)"));
	            ps.setDouble(3, Double.parseDouble(JOptionPane.showInputDialog("Salário de funcionário(a)")));
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
