package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba {
     public static void main(String[] args) {
         final String EDGE_DRIVER = "webdriver.edge.driver";
         final String PATH_DRIVER = "C:\\Users\\JULIO\\Desktop\\drivers\\mozilladriver\\geckodriver.exe";
         System.setProperty(EDGE_DRIVER, PATH_DRIVER);


         WebDriver driver = new FirefoxDriver();

         driver.get("https://wikipedia.com");

        driver.quit();


     }

   
}
