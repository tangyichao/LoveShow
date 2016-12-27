package loveshow.tangyc.com.loveshow;

import android.app.Application;

import com.antfortune.freeline.FreelineCore;

/**
 * Created by tangyc on 2016/12/27.
 */

public class LoveShowApplication extends Application {
    @Override
    public void onCreate() {
        FreelineCore.init(this);
        super.onCreate();
    }
}
