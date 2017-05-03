package com.jarvanh.uitls;

import android.util.Log;

/**
 * 创建者：DXY
 * 描述：Log统一管理类
 **/

public class L {

    public static final boolean isDebug = true;//是否需要打印log
    private static final String TAG = "Smartbutler";

    //默认tag的函数
    public static void d(String text) {
        if (isDebug) {
            Log.d(TAG, text);
        }
    }

    public static void i(String text) {
        if (isDebug) {
            Log.i(TAG, text);
        }
    }

    public static void v(String text) {
        if (isDebug) {
            Log.v(TAG, text);
        }
    }

    public static void e(String text) {
        if (isDebug) {
            Log.e(TAG, text);
        }
    }

    // 传入自定义tag的函数
    public static void i(String tag, String msg)
    {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void d(String tag, String msg)
    {
        if (isDebug)
            Log.d(tag, msg);
    }

    public static void e(String tag, String msg)
    {
        if (isDebug)
            Log.e(tag, msg);
    }

    public static void v(String tag, String msg)
    {
        if (isDebug)
            Log.v(tag, msg);
    }
}
