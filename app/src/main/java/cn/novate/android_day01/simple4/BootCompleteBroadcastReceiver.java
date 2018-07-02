package cn.novate.android_day01.simple4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 13:49
 * Version 1.0
 * Params:
 * Description:    广播接收者 - 接收系统发出的 开机启动完成的广播
*/

public class BootCompleteBroadcastReceiver extends BroadcastReceiver {


    /**
     * 用于接收 开机启动完成的广播
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("TAG" , "开机启动完成......") ;
    }
}
