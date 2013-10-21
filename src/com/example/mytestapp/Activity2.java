package com.example.mytestapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {

	Button button1;
	Button button2;
	
	OnClickListener onClickListener1;
	OnClickListener onClickListener2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		
		onClickListener1 = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on 11");
				Bundle bundle = new Bundle();
				bundle.putString("result", "press on button 1");
				Intent intent = new Intent();
				intent.putExtras(bundle);
				setResult(RESULT_OK, intent);
				finish();
			}
		};
		onClickListener2 = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on 21");
			}
		};
		
		button1 = (Button)findViewById(R.id.button5);
		button2 = (Button)findViewById(R.id.button6);
		button1.setOnClickListener(onClickListener1);
		button2.setOnClickListener(onClickListener2);
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		if (bundle != null)
		{
			String data = bundle.getString("mykey");
			setTitle(data);
		}
		
	}

}
