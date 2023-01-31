package commonFuntions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static String username=null;
	public static String password=null;
	public static String username1=null;
	public static String path=null;
	public static WebDriver fire1=null;
	
	@BeforeSuite
	public void Beforesuite() throws ClassNotFoundException, SQLException {
		
		Connection JDBCconn1 = DriverManager.getConnection("jdbc:mysql://root@localhost/tata-1mg");

		Statement statement1 = JDBCconn1.createStatement();
		String Query ="select * from configurationfile";

		ResultSet resultSet1 = statement1.executeQuery(Query);
		
		int rowCount = 0;
		
		while (resultSet1.next()) {
			rowCount++;
			
			 username1 = resultSet1.getString(1);
			 password=resultSet1.getString(2);
			 path = resultSet1.getString(3);
		
			 System.out.println(path);
			 System.out.println(username1);
			 System.out.println(password);
			if (rowCount == 1) {
				break;
			}
		}
		
		 if(username1.contains("fire")) {
		 System.setProperty("webdriver.gecko.driver",path); 
		 fire1=new FirefoxDriver();
		 fire1.navigate().to("https://www.1mg.com/"); 
		 fire1.manage().timeouts().getImplicitWaitTimeout();
		 fire1.navigate().refresh();
		 }
		}
		
	@AfterSuite
	public void Aftersuite() {
		
		
	}

}
