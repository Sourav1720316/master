package PracticeTestNG;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class nitigrities {

	public void hash() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Customer1", "Sourav");
		map.put("Customer2", "Pom");
		map.put("Customer3", "Mii");
		
		for(Map.Entry val : map.entrySet()) {
			String eachVal = (String) val.getKey();
			System.out.println(eachVal);
		}
	}
}
