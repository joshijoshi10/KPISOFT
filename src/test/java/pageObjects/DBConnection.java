package pageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import config.ConfigFileReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helper.LoggerHelper;

public class DBConnection extends BasePage {
	public DBConnection(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	Logger log = LoggerHelper.getLogger(LoggerHelper.class);

	public void setPasswordforTenant() {
		try {
			log.info("resetting password for tenant admins!!");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://"+ConfigFileReader.getDBHost()+"/"+ConfigFileReader.getDBName(), ConfigFileReader.getDBUser(),
					ConfigFileReader.getDBPassword());
			log.info("connection made!!");
			System.out.println("success");
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(
					"UPDATE USR_DET_USER SET PASSWORD_NEW='{bcrypt}$2a$10$dYsIg8dLbAGbVwHS.lva5e89IMFKl31kHh5S76NgqgVgOUb8hEMiC' WHERE UDU_PK_ID IN (SELECT ID FROM EMP_DET_EMPLOYEE WHERE last_modified_by='kpisoft.1@gmail.com')");
			log.info("users :"+ rs);
			log.info("password reset for "+rs+ "users");
			con.close();
			log.info("connection closed!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("class exception");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			log.info("SQLException: " + e.getMessage());
			log.info("SQLState: " + e.getSQLState());
			log.info("VendorError: " + e.getErrorCode());
		}
	}

	public void setPasswordforAllUsers() {
		try {
			log.info("resetting password for all users!!");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://"+ConfigFileReader.getDBHost()+"/"+ConfigFileReader.getDBName(), ConfigFileReader.getDBUser(),
					ConfigFileReader.getDBPassword());
			log.info("connection made!!");
			
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(
					"UPDATE USR_DET_USER SET PASSWORD_NEW='{bcrypt}$2a$10$dYsIg8dLbAGbVwHS.lva5e89IMFKl31kHh5S76NgqgVgOUb8hEMiC' WHERE UDU_PK_ID IN (SELECT ID FROM EMP_DET_EMPLOYEE WHERE EMAIL LIKE '%@%.com')");
			log.info("users :"+ rs);
			log.info("password reset for "+rs+ "users");
			con.close();
			log.info("connection closed!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("class exception");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
			log.info("SQLException: " + e.getMessage());
			log.info("SQLState: " + e.getSQLState());
			log.info("VendorError: " + e.getErrorCode());
		}

	}

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://"+ConfigFileReader.getDBHost()+"/"+ConfigFileReader.getDBName(), ConfigFileReader.getDBUser(),
					ConfigFileReader.getDBPassword());
			System.out.println("success");
			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(
					"UPDATE USR_DET_USER SET PASSWORD_NEW='{bcrypt}$2a$10$dYsIg8dLbAGbVwHS.lva5e89IMFKl31kHh5S76NgqgVgOUb8hEMiC' WHERE UDU_PK_ID IN (SELECT ID FROM EMP_DET_EMPLOYEE WHERE EMAIL LIKE '%@%.com')");
			System.out.println(rs);
			con.close();
			System.out.println("Connection closed!!");
		} catch (ClassNotFoundException e) {
			System.out.println("class exception");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}

}