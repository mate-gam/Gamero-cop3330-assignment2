/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex39;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App
{
    List<Map<String,String>> addDataSet(List<Map<String, String>> dataSet)
    {
        Map<String, String> d1 = new HashMap<String, String>();
        d1.put("First Name", "John");
        d1.put("Last Name", "Johnson");
        d1.put("Position", "Manager");
        d1.put("Separation Date", "2016-12-31");

        Map<String, String> d2 = new HashMap<String, String>();
        d2.put("First Name", "Tou");
        d2.put("Last Name", "Xiong");
        d2.put("Position", "Software Engineer");
        d2.put("Separation Date", "2016-10-05");

        Map<String, String> d3 = new HashMap<String, String>();
        d3.put("First Name", "Michaela");
        d3.put("Last Name", "Michaelson");
        d3.put("Position", "Distric Manager");
        d3.put("Separation Date", "2015-12-19");

        Map<String, String> d4 = new HashMap<String, String>();
        d4.put("First Name", "Jake");
        d4.put("Last Name", "Jacobson");
        d4.put("Position", "Programmer");
        d4.put("Separation Date", "");

        Map<String, String> d5 = new HashMap<String, String>();
        d5.put("First Name", "Jacquelyn");
        d5.put("Last Name", "Jackson");
        d5.put("Position", "DBA");
        d5.put("Separation Date", "");

        Map<String, String> d6 = new HashMap<String, String>();
        d6.put("First Name", "Sally");
        d6.put("Last Name", "Webber");
        d6.put("Position", "Web Developer");
        d6.put("Separation Date", "2015-12-18");
        dataSet.add(d1); dataSet.add(d2);
        dataSet.add(d3); dataSet.add(d4);
        dataSet.add(d5); dataSet.add(d6);
        return dataSet;
    }

    String[] compareDataSet(List<Map<String, String>> dataSet)
    {
        String temp = "";
        String[] order = new String[6];
        for (int i = 0; i < 6; i++)
        {
            order[i] = dataSet.get(i).get("Last Name");
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++)
            {
               if (order[i].compareTo(order[j])>0)
               {
                   temp = order[i];
                   order[i] = order[j];
                   order[j] = temp;
               }
            }
        }
        return order;
    }
    
    public static void main(String[] args)
    {
        List<Map<String, String>> dataSet = new ArrayList<Map<String,String>>();
        App app = new App();
        dataSet = app.addDataSet(dataSet);
        String[] orderNames = new String[6];
        orderNames = app.compareDataSet(dataSet);
        String format = "%-21s|%-20s|%-20s\n";
        System.out.format(format + "---------------------|--------------------" +
                "|---------------\n", "Name", "Position", "Separation Date");


        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                if (Objects.equals(orderNames[i], dataSet.get(j).get("Last Name")))
                {
                    String formatTheList = "%-20s |%-20s|%-20s\n";
                    System.out.format(formatTheList, dataSet.get(j).get("First Name") + " " + dataSet.get(j).get("Last Name"),
                            dataSet.get(j).get("Position"), dataSet.get(j).get("Separation Date"));
                    break;
                }
            }
        }
    }
}
