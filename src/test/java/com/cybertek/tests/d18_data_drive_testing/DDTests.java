package com.cybertek.tests.d18_data_drive_testing;

import com.cybertek.tests.TestBase;
import org.testng.annotations.DataProvider;

public class DDTests extends TestBase {
    @DataProvider()
    public Object [][] userlist(){
                        //read from excel in 2nd array format
        //code: ExcelUtil qa1Short = new ExcelUtil(relative path, sheetName);
        //code: String [][] dataArray = qa3Short.getDataArray();
                        //return the 2nd array
        //code: return dataArray;
        return userlist();
    }

       //code:@Test(dataProvider = "userlist")
       //code:public void test1(){}


}
