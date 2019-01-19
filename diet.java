import java.util.*;

public class diet
{
    private double fatgoal, protgoal, carbgoal;
    ratio goal;
    ArrayList<ratio> foodratios =new ArrayList<ratio>();    
    
    public diet(double fatgoal, double protgoal, double carbgoal)
    {
        goal = new ratio(fatgoal, protgoal, carbgoal);
    }

    public void addfood(Food f)
    {
        foodratios.append = new ratio(Double.parseDouble(f.fat), Double.parseDouble(f.prot), Double.parseDouble(f.carb));
    }

    public double getfat()
    {
        return fatratio;
    }
    public double getprot()
    {
        return protratio;
    }
    public double getcarb()
    {
        return carbratio;
    }
}
