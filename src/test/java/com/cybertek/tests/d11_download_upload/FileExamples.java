package com.cybertek.tests.d11_download_upload;

import org.testng.annotations.Test;

public class FileExamples {
    @Test
    public void test(){
        //shows the path to out project
        System.out.println(System.getProperty("user.id"));
        //shows our laptop model
        System.out.println(System.getProperty("os.name"));
        //shows user name
        System.out.println(System.getProperty("user.home"));

        //location of current project
        String projectPath = System.getProperty("user.dir");
        //location of the file within the project
        String relativePath = "\\src\\test\\resources\\test_file.txt";

        String fullPath = projectPath+relativePath;
        System.out.println(fullPath);
    }
}
