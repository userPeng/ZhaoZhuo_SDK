package com.ignite.vision.sdk;

import android.content.Context;
import android.widget.Toast;

/**
 * @包名: com.ignite.vision.sdk
 * @创建者: zpeng
 * @描述: TODO
 * @更新内容: TODO
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str+"", Toast.LENGTH_LONG).show();
    }
}
