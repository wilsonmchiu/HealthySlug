import java.util.*;

public class dietcalc
{
    public diet generatediet(ratio goal, ArrayList<Food> menu)
    {  
        int numberfoodeaten = 5; 
        //make this part use some method to get the arraylist of foods
        diet samplediet = new diet(goal);
        samplediet.addfood(menu);
        printdata(samplediet.goal.fatratio, samplediet.goal.protratio, samplediet.goal.carbratio, samplediet);
        ArrayList<Integer> eaten = new ArrayList<Integer>();
        for(int x = 0; x< numberfoodeaten ; x++)
        {
            int location = findbest(samplediet.foodratios, goal, eaten);
            eaten.add(location);
            System.out.println(menu.get(location).name + " has been eaten");
            samplediet.goal = new ratio(goal.fatratio + samplediet.goal.fatratio - samplediet.foodratios.get(location).fatratio, goal.prot + samplediet.goal.prot - samplediet.foodratios.get(location).protratio, goal.fat + samplediet.goal.carb - samplediet.foodratios.get(location).carbratio);
            printdata(samplediet.goal.fatratio, samplediet.goal.protratio, samplediet.goal.carbratio, samplediet);
        }
        return samplediet;
    }

    static int findbest(ArrayList<ratio> f, ratio goal, ArrayList<Integer> eaten)
    {
        double bestdelta = 1000;
        int location = 0;
        for(int x = 0; x < f.size(); x++)
        {
            if(f.get(x).delta(goal) < bestdelta)
            {
                if(!eaten.contains(x))
                {
                    location = x;
                    bestdelta = f.get(x).delta(goal);
                }
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