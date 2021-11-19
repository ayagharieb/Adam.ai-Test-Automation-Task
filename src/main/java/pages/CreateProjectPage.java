package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProjectPage {
    private WebDriver driver;

    private By creatproject=By.xpath("(//span[text()='Create Project']/..)[1]");
    private By projectname=By.xpath("(//input[@id='name'])[2]");
//    private By colorcode=By.xpath("//input[@id='input_80']");
    private By next=By.xpath("//button[@type='submit']");
    private By create=By.xpath("(//span[text()='Create']/..)[2]");

    public  CreateProjectPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void  Creatproject(String name,String color)
    {
        driver.findElement(creatproject).click();
        driver.findElement(projectname).sendKeys(name);
//        driver.findElement(colorcode).sendKeys(color);
        driver.findElement(next).click();
        driver.findElement(create).click();
    }
}
