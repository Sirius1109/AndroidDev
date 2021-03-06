package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class FirstActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {  
	    super.onCreate(savedInstanceState);  
	    Log.d("FirstActivity", "Task id is " + getTaskId());
	    requestWindowFeature(Window.FEATURE_NO_TITLE);  
	    setContentView(R.layout.first_layout);  
	    Button button1 = (Button) findViewById(R.id.button_1);  
	    
	    button1.setOnClickListener(new OnClickListener() {  
	    	@Override  
	        public void onClick(View v) {  
	 
	            Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
	            
	            startActivity(intent);
	        }  
	    });  
	} 
	
	@Override
	protected void onRestart(){
		super.onRestart();
		Log.d("FirstActivity", "onRestart");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main,menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
		}
	
	@Override
	protected void onActivityResult(int requestCode,int resultCode,Intent data){
		switch (requestCode){
		case 1:
			if (resultCode == RESULT_OK) {
				String returnedData = data.getStringExtra("data_return");
				Log.d("FirstActivity",returnedData);
				
			}
			break;
		default:
		}
	}
}
