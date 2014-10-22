package com.android.main;

import android.os.Handler;
import android.os.Message;

public class MyHandler extends Handler{
	private Account_Activity context;
	
	public MyHandler(Account_Activity context) {
		super();
		this.context = context;
	}

	@Override
	public void handleMessage(Message msg) {
		// TODO Auto-generated method stub
		super.handleMessage(msg);
		switch (msg.what) {
        case 1:
            context.update();
            break;
    }
	}
	
}
