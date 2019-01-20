import java.io.*;
import java.util.Scanner;
import java.io.File;
public class parseFiles{
	static ArrayList<FoodToPush> all_food =new ArrayList<FoodToPush>();


	public static void main(String[] args){
		File dir = new File("./dietaryplans");
		File[] directoryList = dir.listFiles();
		for (File plan:directoryList){
			ArrayList<FoodToPush> temp = new ArrayList<FoodToPush>();
			temp = foodFromFile(plan);
			for (FoodToPush item:temp){
				all_food.add(item);
			}
		}


	}

	public ArrayList<FoodToPush> foodFromFile(fileName){
		String loc,diet,meal;
		ArrayList<FoodToPush> foodFromFileList = new ArrayList<FoodToPush>();
		Scanner in = new Scanner(fileName);
		in.useDelimiter("\\Z");
		String s = in.next();
		in.close();
		String[] lines = s.split("\n")
		if (fileName.indexOf("Nine") != -1){
			loc = "Nine";
		}
		else if(fileName.indexOf("Cowell") != -1){
			loc = "Cowell";
		}
		else if(fileName.indexOf("Crown") != -1){
			loc = "Crown";
		}
		else if(fileName.indexOf("Porter") != -1){
			loc = "Porter";
		}
		else if(fileName.indexOf("Rachel") != -1){
			loc = "Rachel";
		}

		if (fileName.indexOf("Breakfast") != -1){
			meal = "Breakfast";
		}
		else if (fileName.indexOf("Dinner") != -1){
			meal = "Lunch";
		}
		else if (fileName.indexOf("Dinner") != -1){
			meal = "Dinner";
		}

		if (fileName.indexOf("Paleo")!=-1){
			diet = "Paleo";
		}
		else if(fileName.indexOf("Keto")!= -1){
			diet = "Keto";
		}
		else if(fileName.indexOf("Balanced")!= -1){
			diet = "Balanced";
		}
		else if(fileName.indexOf("Bulk")!= -1){
			diet = "Bulk";
		}
		
		for (String line:lines){
			FoodFromFileList.add(new FoodToPush(loc,line,diet,meal));
		}
		return FoodFromFileList;

	}
	//public FoodToPush foodFromFile(fileName)

}
