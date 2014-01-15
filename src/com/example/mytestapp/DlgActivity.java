package com.example.mytestapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class DlgActivity extends Activity {

	static final int DIALOG1 = 1;
	static final int DIALOG2 = 1;
	static final int DIALOG3 = 1;
	static final int DIALOG4 = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dlg);
		Button button1 = (Button)findViewById(R.id.dlgbutton1);
		button1.setOnClickListener(new onClickListener()
		{
			public void onClick(View v)
			{
				showDialog(DIALOG1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dlg, menu);
		return true;
	}

}
