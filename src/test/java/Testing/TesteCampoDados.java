package Testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TesteCampoDados {
	private WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://localhost:8081/PaginaSelenium/index.jsp");
	  String title=driver.getTitle();
	  org.testng.Assert.assertTrue(title.contains("Página Inicial"));
  }
  @BeforeTest
  public void beforeTest() {
	  File file = new File("E:/Bibliotecas/selenium-java-3.12.0/WebDrivers/IEDriverServer.exe");
	  System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	  driver = new InternetExplorerDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
