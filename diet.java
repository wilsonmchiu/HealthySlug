import java.util.*;

public class diet
{
    public ratio goal;
    public ArrayList<ratio> foodratios =new ArrayList<ratio>();    
    
    public diet(double fatgoal, double protgoal, double carbgoal)
    {
        goal = new ratio(fatgoal, protgoal, carbgoal);
    }
    public diet(ratio r)
    {
        goal = r;
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
