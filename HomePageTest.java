import com.android.uiautomator.core.UiObjectNotFoundException;
import controls.Base;
import controls.FindBy;
import controls.Util;
import page.HomePage;

public class HomePageTest extends Base
{
    HomePage homePage;

    public HomePageTest() throws UiObjectNotFoundException
    {
        homePage = new HomePage();
    }

    public void testCheck() throws UiObjectNotFoundException, InterruptedException
    {
//        homePage.views.clickAndWaitForNewWindow();
//
//        FindBy.scrollIntoViewList(Util.VERTICAL, homePage.grid);
//
//        assertTrue(homePage.grid.exists());

        FindBy.setAsHorizontalList().scrollForward(2);

        sleep(Util.MIDDLE_PAUSE);
    }
}
