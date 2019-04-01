package com.hcl.mvvm_tutorial.day_two.listView;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hcl.mvvm_tutorial.R;
import com.hcl.mvvm_tutorial.databinding.ActivityListviewBinding;
import com.hcl.mvvm_tutorial.day_two.listView.adapter.NewsAdapter;
import com.hcl.mvvm_tutorial.day_two.listView.viewmodel.NewsViewModel;
import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity
{

    ActivityListviewBinding activityListviewBinding;
    private ArrayList<NewsViewModel> newsViewModelArrayList;

    NewsViewModel newsViewModel;

    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_listview);

        activityListviewBinding = DataBindingUtil.setContentView(ListviewActivity.this, R.layout.activity_listview);

        newsViewModel = new NewsViewModel();
        newsViewModelArrayList = newsViewModel.getArrayListNews();

        newsAdapter = new NewsAdapter(ListviewActivity.this, newsViewModelArrayList);
        activityListviewBinding.listView.setAdapter(newsAdapter);
    }
}
