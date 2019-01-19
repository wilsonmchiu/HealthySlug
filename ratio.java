public class ratio{
    public double fat, carb, prot;
    public ratio(double f, double c, double p)
    {
        fat = f;
        carb = c;
        prot = p;
    }

    public double delta(ratio r)
    {
        return(Math.abs(r.fat - fat) + Math.abs(r.carb - carb) + Math.abs(r.prot - prot));
    }
}