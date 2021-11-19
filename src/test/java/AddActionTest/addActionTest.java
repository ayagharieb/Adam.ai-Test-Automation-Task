package AddActionTest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.AddActionPage;

public class addActionTest extends BaseTest {
    @Test
    public void creatAction()
    {
        homepage.signin("ayagero93@gmail.com","123456789");
      var action= homepage.addAction();
         action.AddAction("123abc");
    }
}
