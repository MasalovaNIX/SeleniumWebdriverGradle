import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;

public class Main {
   @Test
   public void test(){

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\masalova\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

              driver.manage().window().maximize();
              driver.get("http://automationpractice.com/");
              driver.findElement(By.className("search_query")).sendKeys("summer"+ Keys.ENTER);
              driver.findElement(By.id("selectProductSort")).click();
              driver.findElement(By.xpath("//option[@value='price:desc']")).click();
       //List<Integer>
              //driver.close();
   }

}
