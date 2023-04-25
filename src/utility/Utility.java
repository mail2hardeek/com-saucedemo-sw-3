package utility;

import browserfactory.BaseTest;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    public void clickOnElement(By by) {
        //Method to find button Element and click
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text) {
        //Method to find Element and send text
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        //Method to find Element and get text from webpage
        return driver.findElement(by).getText();
    }

    public void countImagesOnWebpage(By by) {
        //Method to get list of Elements from webpage
        WebElement list = driver.findElement(by);
    }

    @After
    public void tearDown() {
        //Close browser
        closeBrowser();
    }
}
