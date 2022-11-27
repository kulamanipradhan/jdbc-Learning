//first jdbc program
import java.sql.*;
class FirstJdbc
{
 public static void main(String[] args) 
 {
		try
		{
			//load the driver;
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			String url = "jdbc:mysql://localhost:3307/kulu";
			String username = "root";
			String password = "761121";


			Connection con = DriverManager.getConnection(url,username,password);


			if(con.isClosed())
			{
				System.out.println("Connection is still closed");
			}
			else 
			{
				System.out.println("Connection is created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}