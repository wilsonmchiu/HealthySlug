import java.util.*;

public class main
{
    public static void main(String [] args)
    {
    //    ratio goal = new ratio(65,50,300); //balanced
    //    ratio goal = new ratio(50,50,0); //paleo
        ratio goal = new ratio(75,20,5); //keto
    //    ratio goal = new ratio(2,6,9); //bulk

       
        dietcalc calculator = new dietcalc();
        calculator.generatediet(goal, menu);
    }
}