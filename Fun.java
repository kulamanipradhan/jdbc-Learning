// Using prepared statement to insert values into the table
// dynamic value insertion
import java.sql.*;
import java.io.*;
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
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter name of the person ...");
			String name = br.readLine();
			System.out.println("enter the city...");
			String city = br.readLine();


			//set the values
			pstmt.setString(1,name);
			pstmt.setString(2,city);
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