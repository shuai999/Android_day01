package cn.novate.android_day01.simple3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 13:36
 * Version 1.0
 * Params:
 * Description:    广播接收者 - 用于接收系统广播发出的 事件
*/

public class SDCardListenerBroadcastReceiver extends BroadcastReceiver {

    /**
     * 用于接收系统广播发出的事件
     * @param context：上下文对象
     * @param intent：激活组件和传递数据
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        // 1. 得到当前接收到的事件名称
        String action = intent.getAction();
        // 2. 使用if...else...判断当前接收到的事件是什么类型
        if ("android.intent.action.MEDIA_MOUNTED".equals(action)){
            Toast.makeText(context , "SD卡被插上了..." , Toast.LENGTH_SHORT).show();
        }
        if ("android.intent.action.MEDIA_UNMOUNTED".equals(action)){
            Toast.makeText(context , "SD卡被拔掉了..." , Toast.LENGTH_SHORT).show();
        }
        if ("android.intent.action.MEDIA_REMOVED".equals(action)){
            Toast.makeText(context , "SD卡被移出了..." , Toast.LENGTH_SHORT).show();
        }
    }
}
