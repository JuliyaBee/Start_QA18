import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class SeleniumStartHW {

        WebDriver wd;
        WebDriver wd1;

        @BeforeMethod
        public void preCondition() {
            System.out.println("Opening web-site");
            wd = new ChromeDriver();
            //   wd.get("https://ilcarro.web.app/search");
            wd.navigate().to("https://telranedu.web.app/login");
            //  wd.navigate().forward();
            //  wd.navigate().back();

        }

        @Test
        public void testLogin() {
        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container.getTagName());
        System.out.println(container.getAttribute("id"));
        WebElement div =wd.findElement(By.tagName("div"));
        System.out.println(div.getText());
        List<WebElement>divs = wd.findElements(By.tagName("div"));
        System.out.println(divs.size());
                WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println((elements.size()));
       WebElement active =  wd.findElement(By.className("active"));
        System.out.println(active.getTagName());
       WebElement phone = wd.findElement(By.tagName("h1"));
        System.out.println(phone.getText());
       WebElement log = wd.findElement(By.linkText("LOGIN"));
        System.out.println(log.getAttribute("login"));

            WebElement container1 = wd.findElement(By.cssSelector(".container"));
            WebElement div1 = wd.findElement(By.cssSelector("div"));
            WebElement a = wd.findElement(By.cssSelector("a"));
            List<WebElement> divs1 = wd.findElements(By.cssSelector("div"));
            List<WebElement> elements1 = wd.findElements(By.cssSelector("a"));
            WebElement active1 = wd.findElement(By.cssSelector(".active"));
            WebElement log1 = wd.findElement(By.cssSelector("[href='/login']"));
            WebElement password = wd.findElement(By.cssSelector("[name='password']"));
            WebElement root = wd.findElement(By.cssSelector("#root"));
            WebElement element1 = wd.findElement(By.cssSelector("a"));
            WebElement form = wd.findElement(By.cssSelector("form"));
            WebElement login_login__3EHKB = wd.findElement(By.cssSelector(".login_login__3EHKB"));
            WebElement login = wd.findElement(By.cssSelector("[href='/login']"));
            WebElement login_style = wd.findElement(By.cssSelector("[style*='border: 1px solid black;'] "));
            WebElement navbar = wd.findElement(By.cssSelector("[class^='navbar']"));
            WebElement style = wd.findElement(By.cssSelector("[style$='color: white;']"));

        }

        @AfterMethod

        public void postCondition() {
            System.out.println("End postCondition");
            //  wd.close();
            wd.quit();
        }
    }


