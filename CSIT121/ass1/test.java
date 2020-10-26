import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
public class test
{


	public static void main (String[] args)
	{

	
		//create objects
		packedMRE Spam = new packedMRE("123456", "it's spam", 4.45, 1, 300, new Dimension(10,10,10), UnitTypeLimit.Bottle, "14-12-1900 09:09:09", "14-12-2019" , new Nutrition("100/122/200/300/400/400"),"American Airforce","X5632");
		packedMeat Wagyu9 = new packedMeat("123457", "grade9 wagyu beef", 4.45, 1, 300, new Dimension(30,30,30), UnitTypeLimit.Box, "14-12-1900 09:09:09", "14-12-2010" , new Nutrition("100/122/200/300/400/400"),"Japanese Wagyu",9);
		freshSpice Weistersauce = new freshSpice("234567", "german sauce", 2.25, 20, 50, "Can", "11-11-2000 08:08:00", "11-11-2011", "mason jar", "pepper, barbeque sauce");
		freshCake PoundCake = new freshCake("234567", "german cakes", 2.25, 20, 50, "Cake", "11-11-2000 08:08:00", "11-11-2011", 10, "Andrew Osborn");
		householdStationery Bently_pen = new householdStationery("234567", "Bently electric pen", 80, 1, 40, new Dimension(1,30,50), "case", "11-09-2018 11:15:00", "09-12-2025", "blue ink", "electric pen");
		householdKitchenWare Yoshihiro_knife = new householdKitchenWare("234567", "Fish knife", 80, 1, 200, new Dimension(4,35,30), "unit", "11-11-2000 08:08:00", "11-11-2011", "Petty", "chief knife");

		//create array list for objects
		ArrayList<product> shoppingCart = new ArrayList<product>();
		shoppingCart.add(Spam);
		//add objects to arraylist
		shoppingCart.add(Wagyu9);
		shoppingCart.add(Weistersauce);
		shoppingCart.add(PoundCake);
		shoppingCart.add(Bently_pen);
		shoppingCart.add(Yoshihiro_knife);
	

		//Core level functions
		//VerifyUnitType on 3 categories
				//Spam.verifyUnitType("Bottle");//returns equal
				//Weistersauce.verifyUnitType("mason jar");// returns equal
				//Bently_pen.verifyUnitType("Bottle");//returns not equal
		//getAttributeDescriptionForSavingTofile
				//System.out.println(Spam.getAttributeDescriptionForSavingTofile());
				//System.out.println(Weistersauce.getAttributeDescriptionForSavingTofile());
				//System.out.println(Bently_pen.getAttributeDescriptionForSavingTofile());				
		//getInformationForSavingToFile
				//System.out.println(Spam.getInformationForSavingToFile());
				//System.out.println(Weistersauce.getInformationForSavingToFile());
				//ystem.out.println(Bently_pen.getInformationForSavingToFile());


		//Standard level functions
		//verifyExpireProduct on 3 categories using date as input
				//Spam.verifyExpireProduct(parseDate("14-11-2019"));// not expire yet
				//Weistersauce.verifyExpireProduct(parseDate("11-11-2011"));// same date as expire date
				//Bently_pen.verifyExpireProduct(parseDate("11-12-2026"));//expired
		//getVolumn
				//System.out.println(Spam.getVolumn());
				//System.out.println(Bently_pen.getVolumn());
		//editProductInformation
				//Spam.editProductInformation("it's not spam", 20, 34.5, 10);
				//System.out.println(Spam);
		//comparePrice
				//Spam.comparePrice(1);
				//Weistersauce.comparePrice(80.43);
				//Yoshihiro_knife.comparePrice(80);

		//Advanced level functions
		//findProductFromDescription print out lines and also return an arrarylist
				//product.findProductFromDescription(shoppingCart, "german");
		//sortByPrice sort the arraylist by price
				//product.sortByPrice(shoppingCart);
		//allProductToString return one single string with all the items in it using toString() of the items
				System.out.println(product.allProductToString(shoppingCart));
	}



	


 	public static Date parseDate(String date) {
    	 try {
        	 return new SimpleDateFormat("dd-MM-yyyy").parse(date);
     	} catch (ParseException e) {
        	 return null;
     	}
  	}
} 







