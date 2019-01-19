import java.util.*;

public class diet
{
    private double fatgoal, protgoal, carbgoal;
    public ratio goal;
    public ArrayList<ratio> foodratios =new ArrayList<ratio>();    
    
    public diet(double fatgoal, double protgoal, double carbgoal)
    {
        goal = new ratio(fatgoal, protgoal, carbgoal);
    }

    public void addfood(Food f)
    {
        foodratios.add(new ratio(Double.parseDouble(f.fat), Double.parseDouble(f.prot), Double.parseDouble(f.carb)));
    }

    public void addfood(ArrayList<Food> f)
    {
        for(int x = 0; x < f.size(); x++)
        {
            addfood(f.get(x));
        }
    }
}
