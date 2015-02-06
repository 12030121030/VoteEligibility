package com.example.vote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button validate1;
	private EditText name1;
	private EditText age1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		validate1 = (Button)findViewById(R.id.validate);
		name1 = (EditText)findViewById(R.id.name);
		age1 = (EditText)findViewById(R.id.age);
		OnClickListener listener= new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				if((Integer.parseInt(age1.getText().toString()) >=18))
				{
				
					Toast.makeText(getApplicationContext(), "You are eligible for voting", Toast.LENGTH_LONG).show();
					
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Not Eligible for Voting", Toast.LENGTH_LONG).show();
				}
			}
			
		};
	}
}
		
