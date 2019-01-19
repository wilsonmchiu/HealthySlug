public class info
{
    private double fat;
    private double prot;
    private double carb;
    public double fatratio;
    public double protratio;
    public double carbratio;

    public void calcratios()
    {
        int total = fat + prot + carb;
        fatratio = fat / total * 100;
        protratio = prot / total * 100;
        carbratio= carb / total * 100;    
    }

    public void addfood(double x, double y, double z)
    {
        fat += x;
        prot += y;
        carb += z;
        calcratios();
    }
}