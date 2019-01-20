import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Calendar;
import java.util.Date;
import java.util.*;
import java.io.*;

public class Clicker {

	static ArrayList<Food> all_food =new ArrayList<Food>();
	
	public static String getMeal(int meal_num)
	{
		String meal = "";
		if (meal_num == 0)
		{
			meal = "Breakfast";
		}
		else if (meal_num == 1)
		{
			meal = "Lunch";
		}
		else
		{
			meal = "Dinner";
		}
		return meal;
	}
	
	public static void getInfo(WebDriver driver, int meal_num, String dining_hall)
	{
		String hall = dining_hall;
		String meal = getMeal(meal_num);
	 	String name = "";
    	String portion = "";
    	String cals = "";
    	String prot = "";
    	String carb = "";
    	String fiber = "";
    	String sugar = "";
    	String fat = "";
    	String fat_s = "";
    	String transF = "";
    	String chol = "";
    	String iron = "";
    	String sod = "";
    	String vit_A = "";
    	String vit_C = "";
    	String vit_B = "";
    	
		for (int row = 3; row < 100; row++)
        {
        	try 
        	{
        		name = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[1]/div/a")).getText();
        		portion = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[2]/div")).getText();
        		cals = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[4]/div[1]")).getText();
        		prot = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[5]/div[1]")).getText();
        		carb = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[6]/div[1]")).getText();
        		fiber = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[7]/div[1]")).getText();
        		sugar = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[8]/div[1]")).getText();
        		fat = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[9]/div[1]")).getText();
        		fat_s = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[10]/div[1]")).getText();
        		transF = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[11]/div[1]")).getText();
        		chol = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[12]/div[1]")).getText();
        		iron = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[13]/div[1]")).getText();
        		sod = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[14]/div[1]")).getText();
        		vit_A = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[15]/div[1]")).getText();
        		vit_C = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[16]/div[1]")).getText();
        		vit_B = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[" + row + "]/td[17]/div[1]")).getText();
        		Food food_item = new Food(hall,meal,name,portion,cals,prot,carb,fiber,sugar,fat,fat_s,transF,chol,iron,sod,vit_A,vit_C,vit_B);
        		all_food.add(food_item);
        	}
        	catch (Exception NoSuchElementException)
        	{
        		break;
        	}
        }
	}
	
	public static void OpenWeb(String[] dininghall,String hall)
	{
		for(int i = 0; i < 3; i++)
		{
			AccessNutrition(dininghall[i],i,hall);
		}
	}
	public static void AccessNutrition(String site, int meal_num,String hall)


	{	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.141.59\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		        
        driver.get(site);
        int report_position = 0;
        for (int i = 3; i < 100; i++)
        {
        	String xpath = "/html/body/div[2]/table[1]/tbody/tr[" + i + "]/td[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/input";
        	try 
        	{
        		driver.findElement(By.xpath(xpath)).click();
        	}
        	catch (Exception NoSuchElementException)
        	{
        		report_position = i;
        		break;
        	}
        }

        String report = "/html/body/div[2]/table[1]/tbody/tr[" + report_position + "]/td/table/tbody/tr/td[1]/input";
        driver.findElement(By.xpath(report)).click();	
        getInfo(driver,meal_num,hall);
        driver.close();
	}

	public ArrayList<Food> getList()
	{
		return all_food;
	}
	
	public static void main(String[] args) throws IOException
	{
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int year = calendar.get(Calendar.YEAR);
				
		String month_str = "";
		String day_str = "";
		String year_str = String.valueOf(year);
		
		if (month < 10)
		{
			month_str = "0" + month;
		}
		else
		{
			month_str = String.valueOf(month);
		}
		if (day < 10)
		{
			day_str = "0" + day;
		}
		else
		{
			day_str = String.valueOf(day);
		}
		
		String C9_Break = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=40&locationName=Colleges+Nine+%26+Ten+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Breakfast&sName=";
		String C9_Lunch = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=40&locationName=Colleges+Nine+%26+Ten+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Lunch&sName=";
		String C9_Dinner = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=40&locationName=Colleges+Nine+%26+Ten+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Dinner&sName=";
		String[] C9 = {C9_Break,C9_Lunch,C9_Dinner};
		
		String Cowell_Break = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=05&locationName=Cowell+Stevenson+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Breakfast&sName=";
		String Cowell_Lunch = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=05&locationName=Cowell+Stevenson+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Lunch&sName=";
		String Cowell_Dinner = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=05&locationName=Cowell+Stevenson+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Dinner&sName=";
		String[] Cowell = {Cowell_Break,Cowell_Lunch,Cowell_Dinner};
		
		String Crown_Break = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=20&locationName=Crown+Merrill+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Breakfast&sName=";
		String Crown_Lunch = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=20&locationName=Crown+Merrill+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Lunch&sName=";
		String Crown_Dinner = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=20&locationName=Crown+Merrill+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Dinner&sName=";
		String[] Crown = {Crown_Break,Crown_Lunch ,Crown_Dinner};
		
		String Porter_Break = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=25&locationName=Porter+Kresge+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Breakfast&sName=";
		String Porter_Lunch = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=25&locationName=Porter+Kresge+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Lunch&sName=";
		String Porter_Dinner = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=25&locationName=Porter+Kresge+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Dinner&sName=";
		String[] Porter = {Porter_Break,Porter_Lunch ,Porter_Dinner};
		
		String Rachel_Break = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=30&locationName=Rachel+Carson+Oakes+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Breakfast&sName=";
		String Rachel_Lunch = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=30&locationName=Rachel+Carson+Oakes+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Lunch&sName=";
		String Rachel_Dinner = "https://nutrition.sa.ucsc.edu/pickMenu.asp?locationNum=30&locationName=Rachel+Carson+Oakes+Dining+Hall&dtdate=" + month_str + "%2F" + day_str + "%2F" + year_str + "&mealName=Dinner&sName=";
		String[] Rachel = {Rachel_Break,Rachel_Lunch ,Rachel_Dinner};
		
		OpenWeb(C9,"C9");
		//OpenWeb(Cowell,"Cowell");
		//OpenWeb(Crown,"Crown");
		//OpenWeb(Porter,"Porter");
		//OpenWeb(Rachel,"Rachel");
		PrintWriter outFile = null;
		outFile = new PrintWriter(new FileWriter("Output.txt"));
		

		//    ratio goal = new ratio(65,50,300); //balanced
   		//    ratio goal = new ratio(50,50,0); //paleo
		ratio goal = new ratio(75,20,5); //keto
	    //    ratio goal = new ratio(2,6,9); //bulk
		dietcalc calculator = new dietcalc();
		calculator.generatediet(goal, all_food);


		for (Food item:all_food){
			System.out.println("KETO");
			//outFile.println(item.name + " " + item.fat + "\n");
			/*
			if (Double.parseDouble(item.fat)/Double.parseDouble(item.carb) > 1){
				System.out.println(item.name + " " + item.fat);
				outFile.println(item.name + " " + item.fat + "\n");
			}*/
			System.out.println(item.name + " " + item.fat + " " + item.prot + " " + item.carb);
			outFile.println(item.name + " " + item.fat + " " + item.prot + " " + item.carb + "\n");
		}
		outFile.close();
	}
}