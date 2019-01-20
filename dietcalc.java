import java.util.*;

public class dietcalc
{
    public diet dietcalc(ratio goal, ArrayList<Food> menu)
    {   
        //make this part use some method to get the arraylist of foods
        diet samplediet = new diet(goal);
        for(int x = 0; x<5 ; x++)
        {
            System.out.println("input fat prot and carb of food");
            int location = findbest(menu, goal);
            samplediet.addfood(menu.get(location));
            samplediet
        }
        return samplediet;
    }



    static int findbest(ArrayList<Food> f, ratio goal)
    {
        diet temp = new diet(0,0,0);
        temp.addfood(f);
        double bestdelta = 1000;
        int location = 0;
        for(int x = 0; x < f.size(); x++)
        {
            if(temp.foodratios.get(x).delta(goal) < bestdelta)
            {
                location = x;
                bestdelta = temp.foodratios.get(x).delta(goal);
            }
        }
        return location;
    }

    static void printdata(double x, double y, double z, diet w)
    {
        System.out.println("Fatgoal:" + x + " Protgoal:" + y + " Carbgoal:" + z);
      //  System.out.println("added stuff adjusted: " + w.getfat() + " "+ w.getprot() + " " + w.getcarb());
    }
}