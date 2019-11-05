import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "C:/Users/ana.maldonado/Documents/Selenium_Essential_Training/chromedriver_win32/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();

        driver.quit();
    }
}
