package com.cybertek.tests.d18_data_drive_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestWithDataProvider {
    //this method will provide test data
    @DataProvider
    public Object [][] testData(){
        String [][] data = {
                {"Kung Fu", "10"},
                {"Titanic", "1"},
                {"interstellar", "2"},
                {"Godfather", "8"},
                {"Frozen", "6"}
        };
        return data;
    }

    @Test(dataProvider = "testData")
    public void test1(String name, String rating){
        System.out.println("Movie" + name + "has rating"+ rating);
    }
}
