
/**
 * Write a description of class NumberProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberProcessor2
{
    private InputReader reader;
    
    public NumberProcessor2()
    {
        reader = new InputReader();
    }
    
    public void sum()
    {
        int number1 = reader.getInt("Please type a positive integer: ");
        for (;number1 < 0;){
            if (number1 < 0){
                number1 = reader.getInt("Please type a positive integer: ");
            }
        }
        int number2 = reader.getInt("Please type another positive integer: ");
        while (number2 < 0){
            if (number2 < 0){
                number2 = reader.getInt("Please type another positive integer: ");
            }
        }
        
        int sum = number1 + number2;
        System.out.println(sum);
    }
    
    public void max()
    {
        int number1 = reader.getInt("Please type a positive integer: ");
        while (number1 < 0){
            if (number1 < 0){
                number1 = reader.getInt("Please type a positive integer: ");
            }
        }
        int number2 = reader.getInt("Please type another positive integer: ");while (number2 < 0){
            if (number2 < 0){
                number2 = reader.getInt("Please type another positive integer: ");
            }
        }
        
        if (number1 > number2){
            System.out.println(number1);
        }
        else if (number2 > number1){
            System.out.println(number2);
        }
    }
    
    public void maxAndSum()
    {
     int number1 = reader.getInt("Please type a positive integer: ");
        while (number1 < 0){
            if (number1 < 0){
                number1 = reader.getInt("Please type a positive integer: ");
            }
        }
        int number2 = reader.getInt("Please type another positive integer: ");while (number2 < 0){
            if (number2 < 0){
                number2 = reader.getInt("Please type another positive integer: ");
            }
        }
        
        if (number1 > number2){
            System.out.println("The largest number is " + number1);
            System.out.println("The sum is " + (number1 + number2));
        }
        else if (number2 > number1){
            System.out.println("The largest number is " + number2);
            System.out.println("The sum is " + (number1 + number2));
        }
    }
}
