package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Prueba {
     public static void main(String[] args) {
         final String EDGE_DRIVER = "webdriver.edge.driver";
         final String PATH_DRIVER = "C:\\Users\\JULIO\\Desktop\\drivers\\mozilladriver\\geckodriver.exe";
         System.setProperty(EDGE_DRIVER, PATH_DRIVER);

         FirefoxOptions firefoxOptions = new FirefoxOptions();
         firefoxOptions.addArguments("--windows-position=-0,750");

         WebDriver driver = new FirefoxDriver(firefoxOptions);

         driver.get("https://wikipedia.com");

         driver.manage().window().maximize();


     }


}
