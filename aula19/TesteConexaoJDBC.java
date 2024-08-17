package aula19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexaoJDBC {
	static String url = "jdbc:mysql://localhost/impacta";
	static String user = "usuario";
	static String password = "senha";

	public static void main(String[] args) {
		openDB();
	}

	public static void openDB() {
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from tabela");) {
			System.out.println("\nConexão estabelecida com sucesso!\n");

		} catch (SQLException e) {
			System.out.println("\nNão foi possível estabelecer conexão" + e
					+ "\n");
			System.exit(1);
		}
	}

}
