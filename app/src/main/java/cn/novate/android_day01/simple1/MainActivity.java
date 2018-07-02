package cn.novate.android_day01.simple1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cn.novate.android_day01.R;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 11:20
 * Version 1.0
 * Params:
 * Description:
*/

public class MainActivity extends AppCompatActivity {

    private EditText et_ipPhone;
    private SharedPreferences sp;
    private String ipPhone;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_01);

        et_ipPhone = (EditText) findViewById(R.id.et_ipPhone);

        // 从sp中取出ipPhone显示在输入框中
        sp = this.getSharedPreferences("config", Context.MODE_PRIVATE);
        ipPhone = sp.getString("ipPhone", null);
        et_ipPhone.setText(ipPhone);
    }

    public void save(View view){
        // 设置一个ip电话

        String ipPhone = et_ipPhone.getText().toString().trim();
        //	SharedPreferences sp = this.getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("ipPhone", ipPhone);
        edit.commit();
        Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();

    }
}
