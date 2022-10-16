package com.akashyadav.newsapp;

import java.util.ArrayList;

public class NewsModal {
    private int totalResults;
    private String status;
    private ArrayList<Articales> articles;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Articales> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articales> articles) {
        this.articles = articles;
    }

    public NewsModal(int totalResults, String status, ArrayList<Articales> articales) {
        this.totalResults = totalResults;
        this.status = status;
        this.articles = articales;
    }
}
