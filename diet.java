public class diet
{
    private double fatgoal, protgoal, carbgoal;
    ratio goal, current;
    public diet(double fatgoal, double protgoal, double carbgoal)
    {
        goal = new ratio(fatgoal, protgoal, carbgoal);
    }

    public void addfood(Food f)
    {
        fat = Double.parseDouble(f.fat);
        prot = Double.parseDouble(f.prot);
        carb = Double.parseDouble(f.carb);
        calcratios();
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
