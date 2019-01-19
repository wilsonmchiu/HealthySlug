import java.util.Scanner;

public class reeval
{
    public static void main(String [] args)
    {
        Scanner read = new Scanner(System.in);
        double fatgoal = 16;
        double protgoal = 12;
        double carbgoal = 72;
        
        diet stuff = new diet(fatgoal, protgoal, carbgoal);
        printdata(fatgoal, protgoal, carbgoal, stuff);
        for(int x = 0; x<5 ; x++)
        {
            System.out.println("input fat prot and carb of food");

            stuff.addfood(read.nextDouble(), read.nextDouble(), read.nextDouble());
            fatgoal = fatgoal - stuff.getfat() + 16;
            protgoal = protgoal - stuff.getprot() + 12;
            carbgoal = carbgoal - stuff.getcarb() + 72;
            printdata(fatgoal, protgoal, carbgoal, stuff);
        }
        read.close();
    }

    static void printdata(double x, double y, double z, diet w)
    {
        System.out.println("Fatgoal:" + x + " Protgoal:" + y + " Carbgoal:" + z);
      //  System.out.println("added stuff adjusted: " + w.getfat() + " "+ w.getprot() + " " + w.getcarb());
    }
}