package BookStore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	public Statement connection() {
		Connection con;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cs27b","root","Fetal3285");
			stmt = con.createStatement();
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		return stmt;

	}
}


