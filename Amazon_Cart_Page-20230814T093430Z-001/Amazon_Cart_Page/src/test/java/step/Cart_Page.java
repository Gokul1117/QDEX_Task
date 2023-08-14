package step;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common_Functions.Common_Functions;
import page_Object_Model.pom;

public class Cart_Page extends Common_Functions {

private static Object parent;
private static Set<String> s;


//Test_Case01
@Test
	public static  void Add_to_cart() {
		
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		
		pomobj.getLoc().submit.click();
		
		pomobj.getLoc().bike.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles(); 
		List<String> list=new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));
		
		pomobj.getLoc().Addtocart.click();
		
		pomobj.getLoc().cartpage.click();
		
	System.out.println("The Add to cart Test case is Done= Pass");
	
		}
	

	//Test Case_02

	@Test
	public static void product_details_check() {
		
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		
		pomobj.getLoc().submit.click();
		
		pomobj.getLoc().bike.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles(); 
		List<String> list=new ArrayList<>(windowHandles2);
	   driver.switchTo().window(list.get(1));
		
		pomobj.getLoc().Addtocart.click();
		
		pomobj.getLoc().cartpage.click();
		
		pomobj.getLoc().ProductDetails.click();
		
    	System.out.println("product details Same=Pass");	
		
	}

	//TestCase_03

	@Test
	public static void Save_Later(){
		
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		
		pomobj.getLoc().submit.click();
		
		pomobj.getLoc().bike.click();
		
    	Set<String> windowHandles2 = driver.getWindowHandles(); 
		List<String> list=new ArrayList<>(windowHandles2);
	  driver.switchTo().window(list.get(1));
		
		pomobj.getLoc().Addtocart.click();
		
		pomobj.getLoc().cartpage.click();
		
		pomobj.getLoc().SaveLater.click();
		
    	System.out.println("Save Later is Done-Pass");
    	
		
	}

	//Test_case_04

	@Test

	public static void proceed_to_Buy() {
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		
		pomobj.getLoc().submit.click();
		
		pomobj.getLoc().bike.click();
	    Set<String> windowHandles2 = driver.getWindowHandles(); 
		List<String> list=new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));
		
		pomobj.getLoc().Addtocart.click();
		
		pomobj.getLoc().cartpage.click();
		
		pomobj.getLoc().buynow.click();
		
    	System.out.println("proceed to buy is done=Pass");
    	
		}



	// Test_case_05

@Test
	public static void Incresing_the_product_Quantity() {
		
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		
		pomobj.getLoc().submit.click();
		
		pomobj.getLoc().bike.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles(); 
		List<String> list=new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));
		
		pomobj.getLoc().Addtocart.click();
		
		pomobj.getLoc().cartpage.click();
		
		pomobj.getLoc().Quantity.click();
		
		pomobj.getLoc().NumOFPiece.click();
		
		System.out.println("Product Quantity check is Done=Pass");
		
		


}

}


