package cn.novate.android_day01.simple6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 14:42
 * Version 1.0
 * Params:
 * Description:    广播接收者 - 用于接收自定义无序广播发送的数据
*/

public class TestBroadcastReceiver extends BroadcastReceiver {

    /**
     * 用于接收自定义广播发送过来的数据
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        String info = intent.getStringExtra("info");
        Log.e("TAG" , "接收自定义广播传递过来的数据：" + info) ;
    }
}
