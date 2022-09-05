import java.util.*;

class Pass_CC_Gen
{
  public static void main ( String[] args )
  {
    Scanner s = new Scanner( System.in );
    Random rand = new Random();    
    int d = 0;
    int c= 0;
    int l=0;
    int p;
  while (true)
  {
     
      System.out.print('\u000C');
          System.out.println("press 1 for password generator and press 2 for credit card pin genrator press 3 for exit");
          p=s.nextInt();

    {if(p==1)
        {System.out.println("you chose password generator");
        while ( d< 5 )
    {
      System.out.println("Your password must have at least 5 characters.");
      System.out.print("How many characters do you want in your password? ");
      d= s.nextInt();
    }
        String choices = "abcdefghijklmnopqrstuvwxyz" ;
    String symbols = "!@#$%^&*";
    choices = choices +symbols+ choices.toUpperCase() ;
    choices = choices +symbols+ "1234567890" ;  

    String password = "";
    int j = 0;
    while ( j<d)
    {
      password = password + choices.charAt( rand.nextInt( choices.length() ) );
      j = j + 1;
    }
    
    System.out.println("Here is your password: " + password );
    
    try {
        
            //sleep 5 seconds
            Thread.sleep(5000);} catch (InterruptedException e) {
            e.printStackTrace();
      // System.out.println("Dont forget to clear the page before closing the page.{to clear Ctrl+k}" );
    }}
    else if  (p==2){
       System.out.println("you chose credit card generator");
    Random r = new Random();
    String randomNumber = String.format("%04d", r.nextInt(1001));//The integer values you generate will be correct for what you need.
                                    //If you want to always have four characters, you can simply write the value to a String with leading zeros
    System.out.println("The Credit Card Pin is:"+randomNumber);
           System.out.println("Dont forget to clear the page before closing the page.{to clear Ctrl+k}" );
           s.nextInt();
        }
        else if(p==3)
            break;
            
          else {System.out.println("you have to press 1 for password generator program and 2 for credit card generator program");}
        
        }
   

    }}}
