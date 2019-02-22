package com.example.ali.expandable;

import java.util.HashMap;
import java.util.List;

public class ModelEx {


    public String getTitleList() {
        return titleList;
    }

    public void setTitleList(String titleList) {
        this.titleList = titleList;
    }

    public String getChildTitle() {
        return childTitle;
    }

    public void setChildTitle(String childTitle) {
        this.childTitle = childTitle;
    }

    public String getChildSubTitle() {
        return childSubTitle;
    }

    public void setChildSubTitle(String childSubTitle) {
        this.childSubTitle = childSubTitle;
    }

    private String titleList;
    private String childTitle;
    private String childSubTitle;
    private HashMap<String , List<String>> childList;
}
