package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
	public WordAdapter(Context context, @LayoutRes int resource, List<Word> wordList) {
		super(context, resource, wordList);
	}
	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		// TODO implement view creation;
		View listItemView = convertView;
		if(listItemView == null) {
			listItemView = LayoutInflater.from(getContext()).inflate(
					R.layout.list_item, parent, false);
		}

		TextView numberTextView = (TextView) listItemView.findViewById(R.id.mTranslation);
		numberTextView.setText(getItem(position).getMiwokTranslation());
		return numberTextView;
		//return super.getView(position, convertView, parent);
	}
}
