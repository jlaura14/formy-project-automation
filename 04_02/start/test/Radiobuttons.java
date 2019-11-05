import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver", "C:/Users/ana.maldonado/Documents/Cursos/Selenium_Essential_Training/chromedriver_win32/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton = driver.findElement(By.id("radio-button-1"));
        radioButton.click();

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}