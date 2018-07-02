package cn.novate.android_day01.simple5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 13:56
 * Version 1.0
 * Params:
 * Description:    广播接收者 - 用于接收系统发出的广播
*/

public class AZXZSJBroadcastReceiver extends BroadcastReceiver {


    /**
     * 用于接收系统广播 发出的事件
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        // 1. 获取当前的广播事件名称
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(action)){
            Toast.makeText(context , "有一个软件被安装了..." , Toast.LENGTH_SHORT).show();
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(action)){
            Toast.makeText(context , "有一个软件被卸载了..." , Toast.LENGTH_SHORT).show();
        }
        if ("android.intent.action.PACKAGE_REPLACED".equals(action)){
            Toast.makeText(context , "有一个软件被升级了..." , Toast.LENGTH_SHORT).show();
        }

    }
}
