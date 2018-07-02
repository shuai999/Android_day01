package cn.novate.android_day01.simple6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.novate.android_day01.R;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 14:32
 * Version 1.0
 * Params:
 * Description:    自定义无序广播并发送
*/

public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_06);
    }


    /**
     * 发送自定义无序广播
     */
    public void send(View view){
        // 1. 创建一个意图对象，用于激活广播接收者 和 给 接收者传递数据
        Intent intent = new Intent() ;

        // 2. 设置广播的事件和名称
        // cn.novate.CUSTOMBROADCAST：是在接收广播的清单文件中配置的 action 标签：
        // <action android:name="cn.itcast.CUSTOMBROADCAST"/>
        intent.setAction("cn.novate.CUSTOMBROADCAST") ;

        // novate://dfafdsfds：是在接收广播的清单文件中配置的 data 标签；
        // <data android:scheme="itcast"/>
        intent.setData(Uri.parse("novate://dfafdsfds")) ;

        // 3. 给广播接收者传递数据
        intent.putExtra("info" , "我是自定义广播传递过来的数据") ;
        // 4. 发送自定义广播
        sendBroadcast(intent);
    }
}
