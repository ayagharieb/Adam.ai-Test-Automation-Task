package createprojectTest;

import basetest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateProjectTest extends BaseTest {
    @Test
    public void CreateProject()
    {
        homepage.signin("ayagero93@gmail.com","123456789");
        var project =homepage.clickproject();
        project.Creatproject("ayaa","#85F138");
    }
}
