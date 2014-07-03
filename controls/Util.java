package controls;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;


public class Util
{
    public static final int SHORT_PAUSE = 1000;
    public static final int MIDDLE_PAUSE = 3000;
    public static final int LONG_PAUSE = 5000;

    public static final String HORIZONTAL = "Horizontal";
    public static final String VERTICAL = "Vertical";

    public static final String BUTTON = "android.widget.Button";
    public static final String RADIO_BUTTON = "android.widget.RadioButton";

    public static final String VIEW = "android.view.View";
    public static final String TEXT_VIEW = "android.widget.TextView";
    public static final String LIST_VIEW = "android.widget.ListView";
    public static final String IMAGE_VIEW = "android.widget.ImageView";
    public static final String ABS_LIST_VIEW = "android.widget.AbsListView";
    public static final String HORIZONTAL_SCROLL_VIEW = "android.widget.HorizontalScrollView";
    public static final String SCROLL_VIEW = "android.widget.ScrollView";
    public static final String GRID_VIEW = "android.widget.GridView";

    public static final String LINEAR_LAYOUT = "android.widget.LinearLayout";
    public static final String RELATIVE_LAYOUT = "android.widget.RelativeLayout";
    public static final String FRAME_LAYOUT = "android.widget.FrameLayout";

    public static final String EDIT_TEXT = "android.widget.EditText";
    public static final String CHECKBOX = "android.widget.CheckBox";
    public static final String SPINNER = "android.widget.Spinner";
    public static final String GALLERY = "android.widget.Gallery";


    public static final UiObject CONFIRM_BTN = new UiObject(new UiSelector().text("确认"));
    public static final UiObject CANCEL_BTN = new UiObject(new UiSelector().text("取消"));
    public static final UiObject ALL_APPS_BUTTON = new UiObject(new UiSelector().description("Apps"));

    public static final UiSelector LAUNCHER_CONTAINER = new UiSelector().scrollable(true);

    public static final UiSelector LAUNCHER_TEXT_VIEW = new UiSelector().className(TEXT_VIEW);
    public static final UiSelector LAUNCHER_IMAGE_VIEW = new UiSelector().className(IMAGE_VIEW);
}
