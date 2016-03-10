package com.sirius.btclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bt1 = (Button) findViewById(R.id.bt1);
		bt1.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v){
				System.out.println("第一个点击");
			}
		});
		Button bt2 = (Button) findViewById(R.id.bt2);
		bt2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		System.out.println("第二个");
		
	}
	
	public void getScores(View v){
		System.out.println("上不去");
	}

}
