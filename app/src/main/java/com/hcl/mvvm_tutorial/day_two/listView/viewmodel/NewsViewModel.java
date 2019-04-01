package com.hcl.mvvm_tutorial.day_two.listView.viewmodel;

import com.hcl.mvvm_tutorial.day_two.listView.model.News;

import java.util.ArrayList;

public class NewsViewModel {

    public String headline;
    public String description;

    public NewsViewModel()
    {

    }

    public NewsViewModel(News news)
    {
        this.headline = news.headline;
        this.description = news.description;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public ArrayList<NewsViewModel> getArrayListNews()
    {
        ArrayList<NewsViewModel> newsModelArryList = new ArrayList<>();
        NewsViewModel newModel1 = new NewsViewModel(new News("First Heading" , "This is 1 news"));
        NewsViewModel newModel2 = new NewsViewModel(new News("Second Heading" , "This is 2 news"));
        NewsViewModel newModel3 = new NewsViewModel(new News("Third Heading" , "This is 3 news"));
        NewsViewModel newModel4 = new NewsViewModel(new News("Fourth Heading" , "This is 4 news"));
        NewsViewModel newModel5 = new NewsViewModel(new News("First Heading" , "This is 1 news"));
        NewsViewModel newModel6 = new NewsViewModel(new News("Second Heading" , "This is 2 news"));
        NewsViewModel newModel7 = new NewsViewModel(new News("Third Heading" , "This is 3 news"));
        NewsViewModel newModel8 = new NewsViewModel(new News("Fourth Heading" , "This is 4 news"));
        NewsViewModel newModel9 = new NewsViewModel(new News("First Heading" , "This is 1 news"));
        NewsViewModel newModel10 = new NewsViewModel(new News("Second Heading" , "This is 2 news"));
        NewsViewModel newModel11 = new NewsViewModel(new News("Third Heading" , "This is 3 news"));
        NewsViewModel newModel12 = new NewsViewModel(new News("Fourth Heading" , "This is 4 news"));
        NewsViewModel newModel13 = new NewsViewModel(new News("First Heading" , "This is 1 news"));
        NewsViewModel newModel14 = new NewsViewModel(new News("Second Heading" , "This is 2 news"));
        NewsViewModel newModel15 = new NewsViewModel(new News("Third Heading" , "This is 3 news"));
        NewsViewModel newModel16 = new NewsViewModel(new News("Fourth Heading" , "This is 4 news"));

        newsModelArryList.add(newModel1);
        newsModelArryList.add(newModel2);
        newsModelArryList.add(newModel3);
        newsModelArryList.add(newModel4);
        newsModelArryList.add(newModel5);
        newsModelArryList.add(newModel6);
        newsModelArryList.add(newModel7);
        newsModelArryList.add(newModel8);
        newsModelArryList.add(newModel9);
        newsModelArryList.add(newModel10);
        newsModelArryList.add(newModel11);
        newsModelArryList.add(newModel12);
        newsModelArryList.add(newModel13);
        newsModelArryList.add(newModel14);
        newsModelArryList.add(newModel15);
        newsModelArryList.add(newModel16);

        return newsModelArryList;
    }


}
