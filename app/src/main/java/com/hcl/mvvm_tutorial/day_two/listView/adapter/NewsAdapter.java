package com.hcl.mvvm_tutorial.day_two.listView.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.hcl.mvvm_tutorial.R;
import com.hcl.mvvm_tutorial.databinding.ListRowBinding;
import com.hcl.mvvm_tutorial.day_two.listView.viewmodel.NewsViewModel;
import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsViewModel>
{

    ArrayList<NewsViewModel> newsModelArrayList;
    Context context;

    public NewsAdapter(Context context, ArrayList<NewsViewModel> newsModelArrayList)
    {
        super(context, R.layout.list_row, newsModelArrayList);

        this.context = context;
        this.newsModelArrayList = newsModelArrayList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_row, parent, false);

        listRowBinding.setNewslist(newsModelArrayList.get(position));

        return listRowBinding.getRoot();
    }
}
