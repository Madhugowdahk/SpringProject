package jdbcproject.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
	public static void main(String[] args) {
		
try {
	Class.forName("com.mysql.cj.jdbc.driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3600/employedet","root","root");
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery("select*from emplye where eid=1 ");
	while(resultSet.next())
	{
		System.out.println("the employee eid id:"+resultSet.getInt(1));
		System.out.println("the employee eid id:"+resultSet.getInt(2));
	}
	connection.close();
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
