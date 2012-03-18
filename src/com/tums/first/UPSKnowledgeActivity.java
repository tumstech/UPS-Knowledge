package com.tums.first;

import org.apache.commons.lang.math.NumberUtils;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UPSKnowledgeActivity extends Activity {

	public static final String TAG = "UPSKnowledgeActivity";

	private TextView tv = null;
	private EditText batteryVoltage = null;
	private EditText batteryAmpHour = null;
	private EditText batteryCount = null;

	private void updateTotalVA() {
		tv.setText("" + (NumberUtils.toInt(batteryVoltage.getText().toString())
				* NumberUtils.toInt(batteryAmpHour.getText().toString())
				* NumberUtils.toInt(batteryCount.getText().toString())) );
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		batteryVoltage = (EditText) findViewById(R.id.batteryVoltageText);
		batteryAmpHour = (EditText) findViewById(R.id.batteryAmpHourText);
		batteryCount = (EditText) findViewById(R.id.batteryCountText);

		batteryVoltage.setText("0");
		batteryAmpHour.setText("0");
		batteryCount.setText("0");

		tv = (TextView) findViewById(R.id.totalVAUpdateLabel);
		// EditText batteryVoltageText = (EditText)
		// findViewById(R.id.batteryVoltageText);
		batteryVoltage.addTextChangedListener(new TextWatcher() {

			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
//				batteryVoltage.setText("" + NumberUtils.toInt(batteryVoltage.getText().toString()));
				updateTotalVA();
			}

			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {

			}

			public void afterTextChanged(Editable arg0) {

			}
		});
		
		batteryAmpHour.addTextChangedListener(new TextWatcher() {
			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
//				batteryAmpHour.setText("" + NumberUtils.toInt(batteryAmpHour.getText().toString()));
				updateTotalVA();
			}
			
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				
			}
			
			public void afterTextChanged(Editable arg0) {
				
			}
		});
		
		batteryCount.addTextChangedListener(new TextWatcher() {
			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
//				batteryCount.setText("" + NumberUtils.toInt(batteryCount.getText().toString()));
				updateTotalVA();
			}
			
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				
			}
			
			public void afterTextChanged(Editable arg0) {
				
			}
		});

		Button b = (Button) findViewById(R.id.exit);

		b.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

			}
		});
	}
}