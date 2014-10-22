package com.android.main;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.account.R;


public class Account_Activity extends Activity{
	private Button b_get,b_put;
	private EditText ed_money;
	int money;
	private EditText ed_remark;
	private String remarks;
	private String cur_date;
	private Time_Account date;
	public void update(){
		cur_date = new String();
		date = new Time_Account();
		cur_date = date.get_date();
		TextView date_text = (TextView)findViewById(R.id.date);
		date_text.setText(cur_date);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account);
		update();
	}

		
}
