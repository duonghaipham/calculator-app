package com.example.calculator;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

import java.util.List;

public class HistoryAdapter extends BaseAdapter {

    private Activity activity;
    private List<Calculating> historyRecords;

    public HistoryAdapter(Activity activity, List<Calculating> historyRecords)
    {
        this.activity = activity;
        this.historyRecords = historyRecords;
    }

    @Override
    public int getCount() {
        return historyRecords.size();
    }

    @Override
    public Object getItem(int position) {
        return historyRecords.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(R.layout.history_content, null);

        TextView txtDisplay = convertView.findViewById(R.id.key);
        TextView txtResult = convertView.findViewById(R.id.value);

        txtDisplay.setText(historyRecords.get(position).getExpression());
        txtResult.setText(historyRecords.get(position).getResult());

        return convertView;
    }
}
