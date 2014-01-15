package com.example.mytestapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button button1;
	Button button2;
	Button dlgDemoButton;
	
	OnClickListener onClickListener1;
	OnClickListener onClickListener2;
	OnClickListener onDlgDemoClickListener;
	
	static final int REQUEST_CODE = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		onClickListener1 = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on 1");
				Intent intent1 = new Intent(MainActivity.this, Activity1.class);
				startActivity(intent1);
			}
		};
		onClickListener2 = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on 2");
				Intent intent2 = new Intent(MainActivity.this, Activity2.class);
				intent2.putExtra("mykey", "myvalue");
				startActivityForResult(intent2, REQUEST_CODE);
			}
		};
		onDlgDemoClickListener = new OnClickListener()
		{
			public void onClick(View v)
			{
				setTitle("click on Dlg Demo button");
				Intent intent = new Intent(MainActivity.this, DlgActivity.class);
				intent.putExtra("mykey", "From Main Page");
				startActivityForResult(intent, REQUEST_CODE);
			}
		};
		
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		dlgDemoButton = (Button)findViewById(R.id.button7);
		button1.setOnClickListener(onClickListener1);
		button2.setOnClickListener(onClickListener2);
		dlgDemoButton.setOnClickListener(onDlgDemoClickListener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		if (requestCode == REQUEST_CODE)
		{
			if (resultCode == RESULT_OK ||
				resultCode == RESULT_CANCELED)
			{
				Bundle bundle = data.getExtras();
				if (bundle != null)
				{
					String temp = bundle.getString("result");
					setTitle(temp);
				}
			}
		}
	}
}
