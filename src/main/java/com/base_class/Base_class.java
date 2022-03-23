package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class
{
	public static WebDriver d;
	public static Select s;
	public static String value;
	public static void clickOnElement(WebElement element) {
	   element.click();
	}
	public static void sk(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static WebDriver bc(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		d = new ChromeDriver();	
		}else if (type.equalsIgnoreCase("Safari")) {
		System.setProperty("webdriver.safari.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		d = new SafariDriver();	
		}else if (type.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		d = new FirefoxDriver();
		}
		return d;	  
	}
	public static void ss(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);	
	}
	public static void gu(String url) {
		d.get(url);
		//d.manage().window().maximize();
	}
	public static void dd(String type, WebElement element, String value) {
		try {
			s = new Select(element);
			if (type.equalsIgnoreCase("Value")) {
				s.selectByValue(value);
			}else if (type.equalsIgnoreCase("Visible_Text")) {
				s.selectByVisibleText(value);
			}else if (type.equalsIgnoreCase("Index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String particular_cell_data(String path, int ri, int ci) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(ri);
		Cell cell = row.getCell(ci);
		CellType type = cell.getCellType();
		if (type.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		}else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value1 = (int) numericCellValue;
			value= String.valueOf(value1);
		}		
		wb.close();
		return value;
	}
	
}
