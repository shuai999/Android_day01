package cn.novate.android_day01.simple7;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.novate.android_day01.R;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 15:43
 * Version 1.0
 * Params:
 * Description:
*/

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_07);
    }


    /**
     * 自定义有序广播发送消息
     */
    public void send(View view){
        // 1. 创建意图对象，用于 激活接收者 和 给接收者 传递数据
        Intent intent = new Intent() ;
        // 2. 设置广播的事件名称 setAction()
        intent.setAction("cn.novate.gov.FFNTBT") ;

        // 3. 发送有序广播

        // intent 激活接收者给接收者传递数据
        // receiverPermission 权限,只有指定了这个权限的接收者才能接收到广播事件
        // resultReceiver 最后接收到事件的广播接收者
        // scheduler  消息处理器
        // initialCode 初始化码,标识消息的序号,必须>0
        // initialData 传递的初始数据,在接收者中可以使用getResultData()方法接收这个参数
        // initialExtras 传递的额外参数
        sendOrderedBroadcast(intent, null, new ResultBroadcastReceiver(), null, 1, "我是国务院,发放2015年农田补贴,每亩地补贴1000元", null);
    }
}
