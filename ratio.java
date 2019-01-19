public class ratio{
    public double fat, carb, prot;
    public double fatratio, carbratio, protratio;
    public ratio(double f, double c, double p)
    {
        fat = f;
        carb = c;
        prot = p;
        calcratios();
    }

    public void calcratios()
    {
        double total = fat + prot + carb;
        fatratio = fat / total * 100;
        protratio = prot / total * 100;
        carbratio= carb / total * 100;    
    }

    public double delta(ratio r)
    {
        return(Math.abs(r.fatratio - fatratio) + Math.abs(r.carbratio - carbratio) + Math.abs(r.protratio - protratio));
    }
}