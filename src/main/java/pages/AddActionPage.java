package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddActionPage {
    private WebDriver driver;
    private By action=By.xpath("(//ul[contains(@class,'top-nav-bar')]//li)[4]");
    private By actionName=By.xpath("//input[@id='name']");
    private By submit=By.xpath("(//div[@class='row space-between']//button)[2]");
    public  AddActionPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void AddAction(String name) {
        driver.findElement(action).click();
        driver.findElement(actionName).sendKeys(name);

        driver.findElement(submit).click();

    }
}
