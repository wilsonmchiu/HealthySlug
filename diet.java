public class diet
{
    private double fatgoal, protgoal, carbgoal;
    private double fat, prot, carb;
    private double fatratio, protratio, carbratio;
    public diet(double x, double y, double z)
    {
        fatgoal = x;
        protgoal = y;
        carbgoal = z;
        calcratios();
    }

    public void calcratios()
    {
        double total = fat + prot + carb;
        fatratio = fat / total * 100;
        protratio = prot / total * 100;
        carbratio= carb / total * 100;    
    }

    public void addfood(double x, double y, double z)
    {
        fat = x;
        prot = y;
        carb = z;
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
