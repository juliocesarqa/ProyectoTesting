package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;


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

         By txtBoxWiki = By.id("searchInput");
         By btnSearch = By.xpath("//*[@id=\"search-form\"]/fieldset/button/i");


         driver.findElement(txtBoxWiki).sendKeys("Calendario gregoriano");
         driver.findElement(btnSearch).click();

         String titulo = driver.getTitle();
         String titleExpected = "Calendario gregoriano - Wikipedia, la enciclopedia libre";

         Assert.assertEquals(titulo, titleExpected);


         By parrafo = By.xpath("//*[@id=\"Problemas_en_el_calendario\"]");

         List<WebElement> elementos = driver.findElements(parrafo);

         for (WebElement elemento : elementos){ //lee los elementos del List y lo asigna a una variable
             System.out.print(elemento.getText());
             Assert.assertEquals("Problemas en el calendario", elemento.getText());
         }

     }




}
