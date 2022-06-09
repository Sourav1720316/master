package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base {
	
	WebDriver driver;
	public WebDriver chromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Documents\\Sourav\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public void remoteDriver() throws MalformedURLException {
        String baseURL = "http://demo.guru99.com/test/guru99home/";
        String nodeURL = "http://192.168.43.223:5566/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        driver= new RemoteWebDriver(new URL(nodeURL),cap);
    }
	
	public String propertiesFileDataReader() {
		String propValue=null;
		FileReader read;
		try {
			read = new FileReader("data.properties");
			Properties prop = new Properties();
			prop.load(read);
			propValue=prop.getProperty("URL");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return propValue;
		
	}
	
	
	
//	public void readExcel() throws IOException {
//		HashMap<String,String> map=new HashMap<String,String>();
//		File file = new File("C:\\Users\\Sourav\\Documents\\Sourav\\Work\\Data.xlsx");
//		FileInputStream fis = new FileInputStream(file);
//		HSSFWorkbook wb = new HSSFWorkbook(fis);
//		Sheet sheet=wb.getSheet("Data");
//		Row row=sheet.getRow(0);
//		int rowCount=sheet.getLastRowNum();
//		int columnCOunt=row.getLastCellNum();
//		
//		for(int i=0;i<column)
//	}
}
