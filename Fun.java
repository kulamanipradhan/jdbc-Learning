// Using prepared statement to insert values into the table
// dynamic value insertion
import java.sql.*;
class Fun
{
	public static void main(String[] args) {
		try
		{
				//load the driver;
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			String url = "jdbc:mysql://localhost:3307/kulu";
			String username = "root";
			String password = "761121";


			Connection con = DriverManager.getConnection(url,username,password);

			String q = "insert into table1(tName,tcity) values (?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);

			//set the values
			pstmt.setString(1,"punam pradhan");
			pstmt.setString(2,"Odisha");
			pstmt.executeUpdate();

			System.out.println("values inserted......");
			con.close();

		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}