package Hooks;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import commonutilities.CommonFunctions;

public class hooksclass extends CommonFunctions {
	static TreeMap<String, String> map = null;
	static Entry<String, String> lastfile;

	@Before(order = 1)
	public void setUp() throws IOException {
		intializeDriver();
		actionInit();
		webDriverWaitInit();
		javascriptInit();
	}

	@After()
	public void tearDown(Scenario scenario) throws IOException {
		if (driver != null) {
			if (scenario.isFailed()) {
				String TestCaseName = scenario.getName();
				scenario.log("Current Page URL is " + driver.getCurrentUrl());
				System.out.println("Current Page URL is " + driver.getCurrentUrl());
				//messageHandler.log(TestCaseName + "is failed =  " + scenario.isFailed());
				scenario.attach(embedScreenshot(), "image/png","Test");
				File currentDir = new File(System.getProperty("user.dir") + "/target/cucumberreports/Screenshots/");
				map = new TreeMap<String, String>();
				displayDirectoryContents(currentDir);
				String path = printFileList();
				ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(path, "Test");
				tearDownDriver();
			}
			//logger.info("Test Cases Completed");
		}
		tearDownDriver();
	}

	public static String printFileList() {
		String str = null;
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "      " + value);
			str = value;
		}
		lastfile = map.lastEntry();
		System.out.println("last file is" + " " + lastfile);
		return str;
	}

	public static void displayDirectoryContents(File dir) throws IOException {
		String dateTime = "0000-00-00 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				displayDirectoryContents(file);
			} else {
				dateTime = sdf.format(new Date(file.lastModified()));
				map.put(dateTime, file.toString());
			}
		}
	}
}
