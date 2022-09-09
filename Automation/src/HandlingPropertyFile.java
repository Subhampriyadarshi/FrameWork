import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile 
{

	public static void main(String[] args) throws IOException 
	{
     FileInputStream fis=new FileInputStream("./data/commondata.property");
     Properties p=new Properties();
     p.load(fis);
     String url=p.getProperty("Url");
     String un=p.getProperty("Username");
     String pw=p.getProperty("Password");
     System.out.println(url);
     System.out.println(un);
     System.out.println(pw);
     
	}

}
