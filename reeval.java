import java.util.*;

public class reeval
{
    public static void main(String [] args)
    {
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
    }

    static void findbest(ArrayList<Food> f, ratio goal)
    {
        diet temp = new diet(0,0,0);
        temp.addfood(f);
        double bestdelta = 300;
        int location;
        for(int x = 0; x < f.size(); x++)
        {
            if(temp.foodratios.get(x).delta(goal) < bestdelta)
            {
                location = x;
                bestdelta = temp.foodratios.get(x).delta(goal);
            }
        }

    }

    static void printdata(double x, double y, double z, diet w)
    {
        System.out.println("Fatgoal:" + x + " Protgoal:" + y + " Carbgoal:" + z);
      //  System.out.println("added stuff adjusted: " + w.getfat() + " "+ w.getprot() + " " + w.getcarb());
    }
}