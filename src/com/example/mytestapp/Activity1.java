package com.example.mytestapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity1 extends Activity {

	Button button1;
	Button button2;
	
	OnClickListener onClickListener1;
	OnClickListener onClickListener2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		
		onClickListener1 = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on 11");
			}
		};
		onClickListener2 = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on 21");
			}
		};
		
		button1 = (Button)findViewById(R.id.button3);
		button2 = (Button)findViewById(R.id.button4);
		button1.setOnClickListener(onClickListener1);
		button2.setOnClickListener(onClickListener2);
		
	}

}
