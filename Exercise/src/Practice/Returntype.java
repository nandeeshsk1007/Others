package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Returntype {
	Properties pro1;

	public Returntype() throws IOException
	{
		File src = new File("./Practice/data.properties");
		try {
			FileInputStream fin= new FileInputStream(src);
			pro1=new Properties();
			pro1.load(fin);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public String get1()
	{
		String d = pro1.getProperty("sam");
		return d;

	}
}
