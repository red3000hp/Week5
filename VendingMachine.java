
/**
 * Write a description of class VendingMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VendingMachine
{
    private InputReader reader;
    private int noGum ;
    private int noChoc;
    private int noPopcorn;
    private int noJuice;
    public VendingMachine()
    {
        reader = new InputReader();
        noGum = 0;
        noChoc = 0;
        noPopcorn = 0;
        noJuice = 0;
    }

    public void run()
    {
        int number = reader.getInt("Please pick a number 1-5 for your treat!");
        if (number < 1 && number > 5)
        {
            System.out.println("Error, options 1-5 only");
            number = reader.getInt("Please pick a number 1-5 for your treat!");
        }
        else if(number == 1)
        {
            System.out.println("Gum dispensed");
            noGum++;
        }
         else if(number == 2)
        {
            System.out.println("Chocolate dispensed");
            noChoc++;
        }
        else if(number == 3)
        {
            System.out.println("Popcorn dispensed");
            noPopcorn++;
        }
        else if(number == 4)
        {
            System.out.println("Juice dispensed");
            noJuice++;
        }
        else if(number == 5)
        {
            System.out.println("Goodbye.");
        }
    }
    
    public void displayTotals()
    {
        System.out.println(noGum + " items of gum sold");
        System.out.println(noChoc + " items of chocolate sold");
        System.out.println(noPopcorn + " items of popcorn sold");
        System.out.println(noJuice + " items of juice sold");
    }
}
