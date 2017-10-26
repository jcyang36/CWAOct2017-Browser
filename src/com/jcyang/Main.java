package com.jcyang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Browser browser= new Browser();
String browserName="";
String tabSwitch = "";
String tabTitle ="";
String tabUrl="";

System.out.println("What is the name of the browser? ");
        browserName=scanner.nextLine();
if (browserName.equalsIgnoreCase("Internet Explorer")){
            System.out.println("Use a different browser! ");
         return;
        }
        browser.setName(browserName);
        System.out.println("Browser: " +browserName);
        while(!tabSwitch.equalsIgnoreCase("quit")) {
            Tab tab = new Tab();
            System.out.println("Enter title of browser tab : ");
            tabTitle =scanner.nextLine();
            tab.setTitle(tabTitle);
            System.out.println("Enter URL of browser tab: ");
            tabUrl=scanner.nextLine();
            tab.setUrl(tabUrl);
            browser.addTab(tab);
            System.out.println("Would you like to continue? Enter any key to continue or 'quit' to exit");
            tabSwitch=scanner.nextLine();
        }
        String result=browser.getName();
        result+="\n";
        for (Tab t: browser.getTabs()){
             result+=t.getTitle();
             result+="\n";
             result+=t.getUrl();
             result +="\n";
        }
        System.out.println(result);
    }
}
