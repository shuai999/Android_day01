package cn.novate.android_day01.simple1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 11:05
 * Version 1.0
 * Params:
 * Description:    广播接收者 - ip拨号器
*/

public class IPCallBroadcastReceiver extends BroadcastReceiver {


    /**
     * 接收到广播事件调用这个方法
     * @param context：上下文
     * @param intent：激活广播接收者和传递数据用到的意图对象
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        // 接收到广播事件后，在这个方法中可以写自己的业务逻辑

        // 得到正在拨打的电话号码
        String phone = getResultData();

        Log.e("TAG" , "phone : " + phone) ;
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        String ipPhone = sp.getString("ipPhone", null);

        // 给电话重新复制
        phone = phone + ipPhone ;
        // 把修改后的电话号码显示到拨号器上
        setResultData(phone);

    }
}
