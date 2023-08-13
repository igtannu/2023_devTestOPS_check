package com.nagp.utils.configreader;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperty {

	 

	public Properties property() throws IOException
	{
		Properties prop;
		String filePath = "./src/test/resources/config.properties";
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} finally {
		}
		
		return prop;


	}
}
