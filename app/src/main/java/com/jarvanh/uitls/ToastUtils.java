package com.jarvanh.uitls;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * 创建者：DXY
 * 描述：Toast统一管理类
 **/

public class ToastUtils {

    public static boolean isShow = true;

    // 定义字符串
    // CharSequence的值是可读可写序列，而String的值是只读序列
    public static void shows(Context context, CharSequence message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void shows(Context context, int message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void show(Context context, CharSequence message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void show(Context context, int message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    //在屏幕中间显示
    public static void showCenter(Context context, CharSequence message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
