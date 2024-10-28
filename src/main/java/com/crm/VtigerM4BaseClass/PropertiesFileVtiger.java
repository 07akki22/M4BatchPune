package com.crm.VtigerM4BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileVtiger {
	public static String property(String key) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("..\\com.crm.VtigerM4\\src\\test\\java\\PropertyFile.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

}
