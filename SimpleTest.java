import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Razer_Rommel on 30.03.2016.
 */
public class SimpleTest {
    @Test
    public void navigateToRozetkaWebsiteAndsearchForIphon(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua/");
        WebElement searchField = driver.findElement(By.cssSelector(".header-search-input-text.passive"));
        searchField.clear();
        searchField.sendKeys("iPhon 6");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        WebElement searchButton = driver.findElement(By.cssSelector(".btn-link.btn-link-green"));
        searchButton.click();
    }
}
