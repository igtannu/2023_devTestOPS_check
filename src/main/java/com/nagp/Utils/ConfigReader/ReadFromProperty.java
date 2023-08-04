package com.nagp.Utils.ConfigReader;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperty {

	private Properties prop;

	public Properties property() throws IOException
	{
		String filePath = "./src/test/resources/config.properties";
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return prop;


	}
}
