package com.android.main;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;


public class Time_Account extends Thread{
	private SimpleDateFormat account_date;
	private Date now;

	public String get_date()
	{
		account_date = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		now = new Date();
		return account_date.format(now);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		get_date();
		
	}
}
