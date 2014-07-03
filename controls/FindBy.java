package controls;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;

public class FindBy
{
    /*
     * UiSelectorFindBy
     */
    public static UiSelector selectorFindByIndex(int index) throws UiObjectNotFoundException
    {
        return new UiSelector().index(index);
    }

    public static UiSelector selectorFindByDescription(String text) throws UiObjectNotFoundException
    {
        return new UiSelector().description(text);
    }

    public static UiSelector selectorFindByText(String text) throws UiObjectNotFoundException
    {
        return new UiSelector().text(text);
    }

    public static UiSelector selectorFindByStartText(String text) throws UiObjectNotFoundException
    {
        return new UiSelector().textStartsWith(text);
    }

    public static UiSelector selectorFindByClassName(String className) throws UiObjectNotFoundException
    {
        return new UiSelector().className(className);
    }

    public static UiSelector selectorFindByID(String resourceId) throws UiObjectNotFoundException
    {
        return new UiSelector().resourceId(resourceId);
    }

    /*
     *  UiObjectFIndBy
     */

    public static UiObject uiObjectFindByIndex(int index) throws UiObjectNotFoundException
    {
        return new UiObject(selectorFindByIndex(index));
    }

    public static UiObject uiObjectFindByDescription(String text) throws UiObjectNotFoundException
    {
        return new UiObject(selectorFindByDescription(text));
    }

    public static UiObject uiObjectFindByText(String text) throws UiObjectNotFoundException
    {
        return new UiObject(selectorFindByText(text));
    }

    public static UiObject uiObjectFindByStartText(String text) throws UiObjectNotFoundException
    {
        return new UiObject(selectorFindByStartText(text));
    }

    public static UiObject uiObjectFindByClassName(String className) throws UiObjectNotFoundException
    {
        return new UiObject(selectorFindByClassName(className));
    }

    public static UiObject uiObjectFindByID(String resourceId) throws UiObjectNotFoundException
    {
        return new UiObject(selectorFindByID(resourceId));
    }


    /*
     * UiScrollable
     */

    public static UiScrollable setAsHorizontalList()
    {
        UiScrollable hScroll = new UiScrollable(Util.LAUNCHER_CONTAINER);
        hScroll.setAsHorizontalList();
        return hScroll;
    }

    public static UiScrollable setAsVerticalList()
    {
        UiScrollable vScroll = new UiScrollable(Util.LAUNCHER_CONTAINER);
        vScroll.setAsVerticalList();
        return vScroll;
    }

    public static void scrollIntoViewList(String scrollType, UiObject uiObject) throws UiObjectNotFoundException, InterruptedException
    {
        UiScrollable scroll = new UiScrollable(Util.LAUNCHER_CONTAINER);

        if (scrollType.equals(Util.HORIZONTAL))
        {
            scroll.setAsHorizontalList();
        }
        else if (scrollType.equals(Util.VERTICAL))
        {
            scroll.setAsVerticalList();
        }

        for (int i=0; i<3; i++)
        {
            if (!uiObject.exists())
            {
                scroll.scrollIntoView(uiObject);
            }
            Thread.sleep(Util.SHORT_PAUSE);
        }
    }

}

