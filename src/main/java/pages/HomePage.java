package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private  By Email=By.cssSelector("#email");
    private  By pass=By.cssSelector("#password");
    private  By signin=By.xpath("//div[@class='relative']//button");
    private By projectbutton=By.xpath("(//div[@class='side-menu-links-wrapper']//a)[2]");
    private By plusMenu=By.xpath("(//div[contains(@class,'dropdown')]//button)[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void signin(String email,String password)

    {
        driver.findElement(Email).sendKeys(email);
        driver.findElement(pass).sendKeys(password);
        WebElement wait=  new WebDriverWait(driver,Duration.ofSeconds(3))
               .until(ExpectedConditions.elementToBeClickable(signin));
        wait.click();



    }



    public CreateProjectPage  clickproject()
    {
        driver.findElement(projectbutton).click();
        return new CreateProjectPage(driver);
    }

    public AddActionPage addAction() {
        driver.findElement(plusMenu).click();
        return new AddActionPage(driver);
    }

}
