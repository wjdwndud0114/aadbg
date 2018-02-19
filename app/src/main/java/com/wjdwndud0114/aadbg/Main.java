package com.wjdwndud0114.aadbg;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;
/**
 * Created by wjdwndud0114 on 2/19/2018.
 */

public class Main implements IXposedHookLoadPackage {
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals("net.supercat.stone")) {
            XposedBridge.log("Loaded correct app!:" + lpparam.packageName);
            System.load("data/local/tmp/libhook.so");
        }
    }
}
