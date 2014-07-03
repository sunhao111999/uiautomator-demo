package page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import controls.FindBy;
import controls.Util;

public class HomePage
{
    public static UiObject views;

    public static UiObject grid;



    public HomePage() throws UiObjectNotFoundException
    {
        views = FindBy.uiObjectFindByText("Views");

        grid = FindBy.uiObjectFindByText("Grid");


    }
}
