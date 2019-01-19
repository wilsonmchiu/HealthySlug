public class info
{
    private double fat;
    private double prot;
    private double carb;
    private double fatratio;
    private double protratio;
    private double carbratio;
    public info()
    {
        fat = 0;
        prot = 0;
        carb = 0;
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