import java.sql.*;
import java.io.*;
class ImageSave
{
	public static void main(String[] args) {
		try{
			//load 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/kulu","root","761121");

			String q = "insert into images(pic) values(?)";
			PreparedStatement pstmt = con.prepareStatement(q);

			FileInputStream fis = new FileInputStream("test-min.jpg");
			pstmt.setBinaryStream(1,fis,fis.available());
			pstmt.executeUpdate();
			System.out.println("File uploaded ............");
		
		}
		catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}