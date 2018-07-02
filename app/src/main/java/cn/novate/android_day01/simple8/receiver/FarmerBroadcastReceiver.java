package cn.novate.android_day01.simple8.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 15:43
 * Version 1.0
 * Params:
 * Description:    农民广播接收者
*/

public class FarmerBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		
		// 接收上一级广播发送过来的数据
		String resultData = getResultData();
		System.out.println("resultData=="+resultData+"; 感谢当中央感谢国务院,感谢习大大感谢强哥...");
	}
}
