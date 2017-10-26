package com.jcyang;

import java.util.ArrayList;

public class Browser {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public ArrayList<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(ArrayList<Tab> tabs) {
        this.tabs = tabs;
    }

    private ArrayList<Tab> tabs;
    public void addTab(Tab aTab){
        tabs.add(aTab);
    }
    public Browser(){
        tabs = new ArrayList<Tab>();
    }
}
