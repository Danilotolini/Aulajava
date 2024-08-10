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
	            ps.setString(1, JOptionPane.showInputDialog("Nome de funcion�rio(a)"));
	            ps.setString(2, JOptionPane.showInputDialog("Cargo de funcion�rio(a)"));
	            ps.setDouble(3, Double.parseDouble(JOptionPane.showInputDialog("Sal�rio de funcion�rio(a)")));
	            ps.executeUpdate();

	            System.out.println("Funcion�rio cadastrado com sucesso.");

	            ps.close();
	            cn.close();
	            System.out.println("Conex�o encerrada.");
	            
	        } catch (SQLException e) {
	            System.out.println("Falha ao realizar a opera��o.");
	            e.printStackTrace();
	        }
	    }
	}
