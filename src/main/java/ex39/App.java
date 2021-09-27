package ex39;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App
{
    List<Map<String,Object>> addDataSet(List<Map<String, Object>> dataSet)
    {
        Map<String, Object> d1 = new HashMap<String, Object>();
        d1.put("First Name", "John");
        d1.put("Last Name", "Johnson");
        d1.put("Position", "Manager");
        d1.put("Separation Date", "2016-12-31");

        Map<String, Object> d2 = new HashMap<String, Object>();
        d2.put("First Name", "Tou");
        d2.put("Last Name", "Xiong");
        d2.put("Position", "Software Engineer");
        d2.put("Separation Date", "2016-10-05");

        Map<String, Object> d3 = new HashMap<String, Object>();
        d3.put("First Name", "Michaela");
        d3.put("Last Name", "Michaelson");
        d3.put("Position", "Distric Manager");
        d3.put("Separation Date", "2015-12-19");

        Map<String, Object> d4 = new HashMap<String, Object>();
        d4.put("First Name", "Jake");
        d4.put("Last Name", "Jacobson");
        d4.put("Position", "Programmer");
        d4.put("Separation Date", "");

        Map<String, Object> d5 = new HashMap<String, Object>();
        d5.put("First Name", "Jacquelyn");
        d5.put("Last Name", "Jackson");
        d5.put("Position", "DBA");
        d5.put("Separation Date", "");

        Map<String, Object> d6 = new HashMap<String, Object>();
        d6.put("First Name", "Sally");
        d6.put("Last Name", "Webber");
        d6.put("Position", "Web Developer");
        d6.put("Separation Date", "2015-12-18");
        dataSet.add(d1); dataSet.add(d2);
        dataSet.add(d3); dataSet.add(d4);
        dataSet.add(d5); dataSet.add(d6);
        return dataSet;
    }

    List<Map<String,Object>> compareDataSet(List<Map<String, Object>> dataSet)
    {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++)
            {
                //if (dataSet.get(i).get("Last Name").compareTo(dataSet.get(j)) > 0);
            }
        }
        return dataSet;
    }
    
    public static void main(String[] args)
    {
        List<Map<String, Object>> dataSet = new ArrayList<Map<String,Object>>();
        App app = new App();
        dataSet = app.addDataSet(dataSet);
        System.out.println(dataSet.get(0).get("Last Name"));
    }
}
