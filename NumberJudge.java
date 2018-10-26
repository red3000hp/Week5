public class NumberJudge
{
  private int referenceNumber;
  private InputReader reader;
  
  public NumberJudge(int refNum)
  {
  referenceNumber = refNum;
  reader = new InputReader();
  }
  
  public String judge(int number)
  {
      if (number > referenceNumber){
          return "too big!";
      }
      else if (referenceNumber > number){
          return "Too small!";
      }
      else{
          return "Perfect";
      }
  }
  
  public void showJudge(int number)
  {
      if (number > referenceNumber){
          System.out.println("too big!");
      }
      else if (referenceNumber > number){
          System.out.println("Too small!");
      }
      else{
          System.out.println("Perfect");
      }
  }
  
  public void judgeInput()
  {   
    int number1 = reader.getInt("Please type a number? ");
    showJudge(number1);
  }
  
  public void judgeInputSequence()
  { 
      int number2 = 0;
      while (number2 >= 0){
        number2 = reader.getInt("Please type a number? ");
        
        if (number2 < 0){
            System.out.println("Goodbye.");
      }
        else{
            showJudge(number2);
      }
    }
  }
}
