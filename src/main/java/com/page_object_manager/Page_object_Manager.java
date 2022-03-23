package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.base_class.Addtocart_page;
import com.base_class.Dressselect_page;
import com.base_class.Home_page;
import com.base_class.Login_page;
import com.base_class.Order_Summary;
import com.base_class.Payment_page;
import com.base_class.ProceedtoCheckout2;
import com.base_class.ProceedtoCheckout3;
import com.base_class.Proceedtocheckout1;
import com.base_class.Process_Address;
import com.base_class.Process_carriers;
import com.base_class.Women_page;

public class Page_object_Manager {
	public WebDriver driver;
	private Home_page hp;
	private Login_page lp;
	private Women_page wp;
	private Dressselect_page ds;
	private Addtocart_page ap;
	private Proceedtocheckout1 pc1;
	private ProceedtoCheckout2 pc2;
	private ProceedtoCheckout3 pc3;
	private Process_Address pa;
	private Process_carriers pc;
	private Payment_page pay;
	private Order_Summary os;
	
	public Page_object_Manager(WebDriver d) {
		this.driver=d;
	}

	public Home_page getHp() {
		hp = new Home_page(driver);
		return hp;
	}
	
	
	public Login_page getlp() {
		lp = new Login_page(driver);
		return lp;
	}
	
	public Women_page getwp() {
		wp = new Women_page(driver);
		return wp;
	}
	public Dressselect_page getds() {
		ds = new Dressselect_page(driver);	
		return ds;
	}
	public Addtocart_page getap() {
		ap = new Addtocart_page(driver);
		return ap;
	}
	public Proceedtocheckout1 getpc1() {
		pc1 = new Proceedtocheckout1(driver);
		return pc1;
	}
	public ProceedtoCheckout2 getpc2() {
		pc2 = new ProceedtoCheckout2(driver);
		return pc2;
	}
	public ProceedtoCheckout3 getpc3() {
		pc3 = new ProceedtoCheckout3(driver);
		return pc3;
	}
	public Process_Address getpa() {
		pa = new Process_Address(driver);
		return pa;
	}
	public Process_carriers getpc() {
		pc = new Process_carriers(driver);
		return pc;
	}
	public Payment_page getpay() {
		pay = new Payment_page(driver);
		return pay;
	}
	public Order_Summary getos() {
		os = new Order_Summary(driver);
		return os;
	}
	
}
