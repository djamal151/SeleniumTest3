
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.By.*;

public class JpetStore3 {
    WebDriver driver = new ChromeDriver();
    @Test
   public void test1(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");

        driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
        driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a")).click();
         driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.xpath("*[@id='Catalog']/table/tbody/tr[3]")).click();
                driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();

        driver.findElement(linkText("Dalmation")).click();
        driver.findElement(linkText("addToCart")).click();

        driver.findElement(linkText("Cart")).click();
        System.out.println("Successfully added 2 dogs (Poodle and Dalmation) to the cart");
        //*[@id="Catalog"]/table/tbody/tr[3]


    }
}
