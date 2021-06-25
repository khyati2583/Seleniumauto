package org.example;

import java.io.FileInputStream;

import java.util.Properties;

public class LoadProperty {

    static Properties prop;
    static FileInputStream input;
    static  String fileName = "config.properties";
    static String fileLocation ="C:\\Users\\amit_\\IdeaProjects\\SeleniumAuto\\src\\test\\java\\TestData\\config.properties";

    public String getProperty(String KeyName)  {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation);
            prop.load(input);
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(KeyName);
    }
}
