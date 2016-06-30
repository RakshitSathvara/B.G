package in.vaksys.generous.extras;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by dell980 on 6/9/2016.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "gothammedium.ttf");
    }

    /*public static Typeface getGujFont(Context context) {

        return Typeface.createFromAsset(context.getAssets(), "museo.ttf");

    }*/
}
