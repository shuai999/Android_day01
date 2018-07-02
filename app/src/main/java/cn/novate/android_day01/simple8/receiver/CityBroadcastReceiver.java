package cn.novate.android_day01.simple8.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 15:33
 * Version 1.0
 * Params:
 * Description:    市级广播接收者
*/

public class CityBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		
		// 接收有序广播传递过来的数据
		String resultData = getResultData();
		
		System.out.println("我是县级人民政府,接收到了国务院发放的农田补贴:"+resultData);
		
		resultData = "我是国务院,发放2015年农田补贴,每亩地补贴500元";
		
		// 把修改后的数据设置回去，继续传递给下一级广播接收者
		setResultData(resultData);

	}

}
