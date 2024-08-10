package aula24;

import java.sql.*;

public class ExemploStartement {
	  public static void main(String[] args) {      
		        try {
		        	TestarConexao tc = new TestarConexao();
		        	Connection cn = null;
		        	cn = tc.openDB(cn);
		        	Statement st = cn.createStatement();            
		            st.executeUpdate("UPDATE funcionarios SET "
		            		+ "funcionariosSalario = funcionariosSalario + 200");
		            System.out.println("Sal�rios aumentados com sucesso.");
		            tc.closeDB(cn, st);
		            System.out.println("Conex�o encerrada.");
		            
		        } catch (SQLException e) {
		            System.out.println("Falha ao realizar a opera��o.");
		            e.printStackTrace();
		        }
		    }
		}
