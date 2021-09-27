package ex40;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    List<Map<String, String>> dataSet = new ArrayList<Map<String,String>>();
    @Test
    void arrayOfIndex()
    {
        //adds values to the dataSet
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

        App app = new App();
        ArrayList<Integer> testArrayList= new ArrayList<Integer>();
        testArrayList.add(3);
        testArrayList.add(4);
        assertEquals(testArrayList, app.arrayOfIndex(dataSet, testArrayList, "Jac"));
    }
}