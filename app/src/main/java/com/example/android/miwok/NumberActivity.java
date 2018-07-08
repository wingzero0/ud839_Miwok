package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number);

//		LinearLayout rootLayout = (LinearLayout) this.findViewById(R.id.numberRootView);
//		TextView dynamicTextView = new TextView(this);
//		dynamicTextView.setText("dynamic");
//		rootLayout.addView(dynamicTextView);


//		ArrayList<String> words = new ArrayList<>();
		ArrayList<Word> words = new ArrayList<>();
		for(int i = 0; i<1000; i++){
//			words.add(String.valueOf(i));
			words.add(new Word(String.valueOf(i), String.valueOf(i * (-1))));
		}
//		ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);

		WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, words);

		ListView listView = (ListView) findViewById(R.id.list);

		listView.setAdapter(itemsAdapter);
	}
}
