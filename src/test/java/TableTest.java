import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TableTest {

WebDriver wd;
@BeforeMethod
    public  void preCondition() {
    System.out.println("Opening web-site");
    wd = new ChromeDriver();
    wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    //public void tableHW2(){
        // print amount of table rows
        // print amount of table columns
        // find locator for the row3
        // find locator for the last column
    @Test
            public void tableHW2(){
        List<WebElement>columns=wd.findElements(By.cssSelector("table#customers.ws-table-all th"));
        System.out.println("Amount of table columns are " +columns.size());
        List<WebElement>rows=wd.findElements(By.cssSelector("table#customers.ws-table-all td"));
        System.out.println("Amount of table rows are "+ rows.size()/columns.size());
        WebElement row3=wd.findElement(By.cssSelector("table#customers.ws-table-all tbody tr:nth-child(3)"));
        System.out.println(rows.size());
        //List<WebElement>row3=wd.findElements(By.cssSelector("#customers tr:nth-child(3)"));
         List<WebElement>lastColmn=wd.findElements(By.cssSelector("table#customers.ws-table-all tbody tr:nth-child(3n+3"));
        System.out.println(lastColmn.size());
       // List<WebElement>lastColm=wd.findElements(By.cssSelector("#customers tr td:nth-child(3)"));
    }

    @AfterMethod
    public void postCondition(){
    wd.quit();
    }
}


