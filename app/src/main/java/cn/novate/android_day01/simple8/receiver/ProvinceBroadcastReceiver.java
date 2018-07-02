package cn.novate.android_day01.simple8.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/7/2 15:43
 * Version 1.0
 * Params:
 * Description:    省级广播接收者
*/

public class ProvinceBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		// 接收广播发送过来的参数
		String resultData = getResultData();

		System.out.println("我是省级人民政府,接收到了国务院发放的农田补贴:"+resultData);

		resultData = "我是国务院,发放2015年农田补贴,每亩地补贴800元";
		//  拦截广播消息,不传给下一级接收者
//		abortBroadcast();
		// 把修改后的数据设置回去,继续传递给下一级广播接收者
		setResultData(resultData);

	}

}
