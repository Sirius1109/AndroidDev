package com.sirius.mydialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//设置点击监听
		Button bt =  (Button) findViewById(R.id.bt_call);
		
		bt.setOnClickListener(new MyListener());
	}
	
	class MyListener implements OnClickListener{
		  //点击
		@Override
		public void onClick(View v){
			EditText et = (EditText) findViewById(R.id.et_phone);
			String phone = et.getText().toString();
			System.out.println("点击");
			System.out.println(phone);
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_CALL);
			intent.setData(Uri.parse("tel:" + phone));
			
			startActivity(intent);
		}
	}
	
	



}
