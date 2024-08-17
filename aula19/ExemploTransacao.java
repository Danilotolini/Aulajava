package aula19;
import java.sql.*;
public class ExemploTransacao {
    public static void main(String[] args) {
        try {
            realizaOperacao();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void realizaOperacao() throws Exception {
        Connection cn = null;
        Statement st = null;
        
        try {
            cn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/impacta", "root", "Imp@ct@");
            cn.setAutoCommit(false);
            
            st = cn.createStatement();
            String nome = "Lurdes";
            String cargo = "Analista";
            double salario = 8700;
//            st.executeUpdate(
//                	"INSERT INTO funcionarios "
//                	+ "(funcionariosNome, funcionariosCargo, funcionariosSalario) "
//                	+ "VALUES (nome, cargo, salario)");
            st.executeUpdate("DELETE FROM funcionarios WHERE idFuncionarios = 2");
//            st.executeUpdate("UPDATE funcionarios SET "
//            		+ "+ funcionariosSalario = funcionariosSalario + 200");
//            
            cn.commit();
        } catch (SQLException e) {
            cn.rollback();
            throw new Exception("Falha ao acessar base de dados.", e);
        } finally {
            st.close();
            cn.close();
        }
    }
}
