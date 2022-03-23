package com.runner_class;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
//import com.base_class.Addtocart_page;
import com.base_class.Base_class;
//import com.base_class.Dressselect_page;
//import com.base_class.Home_page;
//import com.base_class.Login_page;
//import com.base_class.Order_Summary;
//import com.base_class.Payment_page;
//import com.base_class.ProceedtoCheckout2;
//import com.base_class.ProceedtoCheckout3;
//import com.base_class.Proceedtocheckout1;
//import com.base_class.Process_Address;
//import com.base_class.Process_carriers;
//import com.base_class.Women_page;
import com.page_object_manager.Page_object_Manager;


public class Runner extends Base_class{
public static Logger l = Logger.getLogger(Runner.class);
	public static WebDriver d=bc("Chrome");
	//public static Home_page hp = new Home_page(d);
	//public static Login_page lp = new Login_page(d);
	//public static Women_page wp = new Women_page(d);
	//public static Dressselect_page ds = new Dressselect_page(d);
	//public static Addtocart_page ap = new Addtocart_page(d);
	//public static Proceedtocheckout1 pc1 = new Proceedtocheckout1(d);
//	public static ProceedtoCheckout2 pc2 = new ProceedtoCheckout2(d);
//	public static ProceedtoCheckout3 pc3 = new ProceedtoCheckout3(d);
//	public static Process_Address pa = new Process_Address(d);
//	public static Process_carriers pc = new Process_carriers(d);
//	public static Payment_page pay = new Payment_page(d);
//	public static Order_Summary os = new Order_Summary(d);
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		gu("http://automationpractice.com/index.php");
		l.info("Web Page opened Successfully");
		Page_object_Manager pom = new Page_object_Manager(d);		
		clickOnElement(pom.getHp().getSbtn());
		sk(pom.getlp().getEmail(), particular_cell_data("C:\\Users\\91735\\eclipse-workspace\\Z_Final_Project\\Test_case.xlsx", 2, 1));
		sk(pom.getlp().getPass(), particular_cell_data("C:\\Users\\91735\\eclipse-workspace\\Z_Final_Project\\Test_case.xlsx", 3, 1));
		l.info("Credentials Entered");
		clickOnElement(pom.getlp().getSubmitlogin());
		l.info("Submit button clicked successfully!");
		clickOnElement(pom.getwp().getWomen());
		clickOnElement(pom.getds().getDress());
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOnElement(pom.getap().getQty());
		dd("Value", pom.getap().getDropdown(), "3");
		l.info("Dropdown selected sucessfully");
		clickOnElement(pom.getap().getColor());
		clickOnElement(pom.getap().getAddtocart());
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOnElement(pom.getpc1().getProceed());
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOnElement(pom.getpc2().getProceed2());
		sk(pom.getpa().getMessage(), "N/A");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOnElement(pom.getpa().getPa());
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickOnElement(pom.getpc().getCheckbox());
		clickOnElement(pom.getpc().getProcessCarrier());
		clickOnElement(pom.getpay().getPayment());
		clickOnElement(pom.getos().getIconfirmmyorder());
		ss("C:\\Users\\91735\\eclipse-workspace\\Z_Final_Project\\ScreenShots\\ss1.png");
	}
}
