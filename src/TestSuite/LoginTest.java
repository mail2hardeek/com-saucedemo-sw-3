package TestSuite;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.util.List;

public class LoginTest extends Utility {
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //Finding Element for username and sending text to username field
        sendTextToElement(By.id("user-name"), "standard_user");

        //Finding Element for password and sending text to password field
        sendTextToElement(By.name("password"), "secret_sauce");

        //Finding element to click on login button and perform click
        clickOnElement(By.name("login-button"));

        //List of images to check on webpage
        int xpathCount = driver.findElements(By.xpath("//div[@class='inventory_item_img']")).size();
        System.out.println("Total images are : " + xpathCount);

        List<WebElement> lst = driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getText());
        }
    }

    @After
    public void tearDown() {

        //Close Browser
        closeBrowser();
    }

}
