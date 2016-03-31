package com.sirius.smssender;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void send(View v){
		EditText et_phone = (EditText) findViewById(R.id.et_phone);
		EditText et_content = (EditText) findViewById(R.id.et_content);
		
		String phone = et_phone.getText().toString();
		String content = et_content.getText().toString();
		
		
		//·¢ËÍ¶ÌÐÅ
		SmsManager sm = SmsManager.getDefault();
		
		sm.sendTextMessage(phone, null, content, null, null);
	}
	
	
}
