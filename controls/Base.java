package controls;

import android.os.RemoteException;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import java.io.*;

public class Base extends UiAutomatorTestCase
{
    private static String APP_NAME = "";
    private static String PACKAGE_NAME = "";
    private static String SCREEN_FILE_PATH = "/data/local/" + PACKAGE_NAME;

    public static UiObject yourApp;

    @Override
    protected void setUp() throws UiObjectNotFoundException, RemoteException, IOException, InterruptedException
    {
        new Command("am force-stop " + PACKAGE_NAME).getCommand();
        yourWantPage(Util.ALL_APPS_BUTTON);

        yourApp = FindBy.uiObjectFindByText(APP_NAME);
        FindBy.scrollIntoViewList(Util.HORIZONTAL, yourApp);
        yourApp.clickAndWaitForNewWindow();
        sleep(Util.LONG_PAUSE);

        System.out.println("=======>>>Now Run :" + (String.valueOf(this.getClass()).split("class")[1]).trim() + "_" + String.valueOf(this.getName()));
    }

    @Override
    protected void tearDown() throws IOException
    {
        new Command("am force-stop " + PACKAGE_NAME).getCommand();
    }

    public void yourWantPage(UiObject element) throws UiObjectNotFoundException
    {
        /**
         * 通过后退的方式回到你想要的页面
         */
        sleep(Util.SHORT_PAUSE);
        boolean isFirstPage = true;
        while (isFirstPage)
        {
            if (element.exists())
            {
                element.click();
                isFirstPage = false;
            }
            else if (Util.ALL_APPS_BUTTON.exists())
            {
                this.debug("You already pressBack all-apps page");
                this.debug("Now enter your app again");
                yourApp.clickAndWaitForNewWindow();
                sleep(Util.MIDDLE_PAUSE);
            }
            else
            {
                getUiDevice().pressBack();
                sleep(Util.SHORT_PAUSE);
            }
        }
    }

    public void takeScreenshot(String shotNum) throws IOException
    {

        String logName = (String.valueOf(this.getClass()).split("class")[1]).trim() + "." + String.valueOf(this.getName());
        logName = logName + "-" +shotNum;

        new Command("screencap " + SCREEN_FILE_PATH + "/screen/" + logName + ".png").getCommand();
        sleep(Util.SHORT_PAUSE);
    }

    public void debug(String msg)
    {
        String logName = (String.valueOf(this.getClass()).split("class")[1]).trim() + "" + String.valueOf(this.getName());
        System.out.println(logName + ": --->  " + msg);
    }

}