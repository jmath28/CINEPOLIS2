package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumDEMO {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "//home//neurosciphd//Downloads//geckodriver-v0.33.0-linux64//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://cinepolis.com/");
        System.out.println(driver.getTitle());
        WebElement comboBox = driver.findElement(By.id("cmbCiudades"));
        Select select = new Select(comboBox);
        select.selectByVisibleText("CDMX Norte");
        WebElement comboBox2 = driver.findElement(By.id("cmbComplejos"));
        Select select2 = new Select(comboBox2);
        select2.selectByValue("cinepolis-town-center-el-rosario");
        WebDriverWait wait = new WebDriverWait(driver, 10); // Maximum wait time of 10 seconds
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("42304-cinepolis-town-center-el-rosario-el-aro-4")));
        clickableElement.click();
        driver.quit();
         }
}