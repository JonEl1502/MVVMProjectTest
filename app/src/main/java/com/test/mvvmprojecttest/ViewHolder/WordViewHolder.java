package com.test.mvvmprojecttest.ViewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.test.mvvmprojecttest.R;

public class WordViewHolder extends RecyclerView.ViewHolder {
    private final TextView wordItemView;
    private final ImageView deleteWordItemView;

    private WordViewHolder(View itemView) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.textView);
        deleteWordItemView = itemView.findViewById(R.id.delete_word);
    }

    public void bind(String text) {
        wordItemView.setText(text);
    }

    public static WordViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item_word, parent, false);
        return new WordViewHolder(view);
    }
}
