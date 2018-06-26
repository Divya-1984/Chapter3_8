package packt.selenium.chap3_8_advancedwebdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 11/15/2015.
 */
public class CheckboxesExampleTest {

    String driverPath = "C:\\Selenium\\";
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/html/html_form_input_types.asp");
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    @Test
    public void testCheckboxes_W3Schools() throws Exception {
        WebElement checkbox1 = driver.findElement(By.name("vehicle1"));
        WebElement checkbox2 = driver.findElement(By.name("vehicle2"));
        boolean isFirstSelected = checkbox1.isSelected();
        assertFalse(isFirstSelected);
        boolean isSecondSelected = checkbox2.isSelected();
        assertFalse(isSecondSelected);

        System.out.println(checkbox1.getAttribute("value") + ": " + isFirstSelected);
        System.out.println(checkbox2.getAttribute("value") + ": " + isSecondSelected);
    }
}