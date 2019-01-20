import java.util.*;

public class main
{
    public static void main(String [] args)
    {
    //    ratio goal = new ratio(65,50,300); //balanced
    //    ratio goal = new ratio(50,50,0); //paleo
        ratio goal = new ratio(75,20,5); //keto
    //    ratio goal = new ratio(2,6,9); //bulk

        ArrayList<Food> menu = new ArrayList<Food>();
        menu.add(new Food("1","1","pancake","1","1","7","66","1","1","9","1","1","1","1","1","1","1","1"));
        menu.add(new Food("1","1","patty","1","1","2","17","1","1","7","1","1","1","1","1","1","1","1"));
        menu.add(new Food("1","1","tofu","1","1","5","4","1","1","2","1","1","1","1","1","1","1","1"));
        menu.add(new Food("1","1","oatmeal","1","1","4","19","1","1","2","1","1","1","1","1","1","1","1"));
        menu.add(new Food("1","1","sausage","1","1","7","0","1","1","3","1","1","1","1","1","1","1","1"));
        dietcalc calculator = new dietcalc();
        calculator.generatediet(goal, menu);
    }
}