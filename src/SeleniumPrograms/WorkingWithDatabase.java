package SeleniumPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDatabase {

	public static void main(String[] args) throws SQLException {

		// Establishing the connection to database
		Connection con = DriverManager.getConnection("jdbc:<databaseName>", "pmanda86", "Hello@123");

		Statement stm = con.createStatement();

		ResultSet res = stm.executeQuery("Select * from EMployee"); // praveen

		// i have to loop the entire data and print

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		String UN = driver.findElement(By.id("email")).getText(); // praveen

		if (res.getString(1).equals(UN)) {
			System.out.println("DB values are correct");
		}

	}

}
