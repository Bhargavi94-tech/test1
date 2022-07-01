package testcases;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.AdminHomePage;
import pageclasses.LoginPage;
import testngbaseclass.BaseCLass;

public class VerifyAdminLogin extends BaseCLass {	
	
	@Test
	public void verifyAdminLogin() throws FileNotFoundException {
		try {
		LoginPage lp= new LoginPage(driver);
		AdminHomePage ah= new AdminHomePage(driver);
		lp.login("Admin", "Admin");
		boolean status=ah.verifyAdminHomePage();
		Assert.assertTrue(status);		
		ah.logout();
		}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println("Exception occurs");
			
		}
		
		
		
	}

}

