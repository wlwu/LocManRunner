package com.cdsf.locman.yzy.mobile;
import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Properties;

/**
 * Created by wuwenliang on 2017/5/17.
 */

public class LocManApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
        Properties properties=new Properties();
        String moduleValue=properties.getProperty("module");
        System.out.println("---wuwenliangJJPPUUIIOOMMMM:::"+moduleValue);
    }
}
