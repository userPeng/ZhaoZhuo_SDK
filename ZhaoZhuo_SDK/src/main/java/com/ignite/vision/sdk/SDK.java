package com.ignite.vision.sdk;

import android.content.Context;

/**
 * @包名: com.ignite.vision.sdk
 * @创建者: zpeng
 * @描述: TODO
 * @更新内容: TODO
 */
public class SDK {

    public static Context appContext;//application context,在Application的onCreate中调用OrangeRetrofit.init(this)传进来

    /**
     * 使用库时必须在Application的onCreate方法中显式调用OrangeRetrofit.init(this);
     */
    public static void init(Context context) {
        if (null != context) {
            appContext = context;
        }
    }
}
