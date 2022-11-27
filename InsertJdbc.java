import java.sql.*;
class InsertJdbc
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

			// create a query
			String  q = "CREATE table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";


			//create statement 

			Statement stmt = con.createStatement();

			stmt.executeUpdate(q);
			
			System.out.println("Table created in database.....");
			con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		
	}
}