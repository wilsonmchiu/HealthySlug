import java.util.Scanner;
import java.util.*;

public class reeval
{
    public static void main(String [] args)
    {
        Scanner read = new Scanner(System.in);
        double fatgoal = 16;
        double protgoal = 12;
        double carbgoal = 72;
        
        //make this part use some method to get the arraylist of foods
        ArrayList<Food> foodslist = new ArrayList<Food>();



        diet samplediet = new diet(fatgoal, protgoal, carbgoal);
        printdata(fatgoal, protgoal, carbgoal, stuff);
        for(int x = 0; x<5 ; x++)
        {
            System.out.println("input fat prot and carb of food");

            samplediet.addfood(foodslist);
            fatgoal = fatgoal - stuff.getfat() + 16;
            protgoal = protgoal - stuff.getprot() + 12;
            carbgoal = carbgoal - stuff.getcarb() + 72;
            printdata(fatgoal, protgoal, carbgoal, stuff);
        }
        read.close();
    }

    static void findbest(ArrayList<Food> f, ratio goal)
    {
        diet temp = new diet(0,0,0);
        temp.addfood(f);
        for(int x = 0; x < f.foodratios.size(); x++)
        {

        }

    }

    static void printdata(double x, double y, double z, diet w)
    {
        System.out.println("Fatgoal:" + x + " Protgoal:" + y + " Carbgoal:" + z);
      //  System.out.println("added stuff adjusted: " + w.getfat() + " "+ w.getprot() + " " + w.getcarb());
    }
}