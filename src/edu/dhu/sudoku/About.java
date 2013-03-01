package edu.dhu.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class About extends Activity {
	private static final String TAG = "Sudoku";
	@Override
	protected void onCreate(Bundle savedInstanceState){
		Log.d(TAG, "here");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
	}
	
}
