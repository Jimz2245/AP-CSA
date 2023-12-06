import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
  {
   Scanner o = new Scanner(System.in);
   boolean open; //boolean means this is a true or false scenario
   open = true;
   System.out.print("Hello! How old are you?");
   final int age = o.nextInt(); //final means this value can't be changed, int means this is an integer value
   if((open = true) && (age > 17))
   {
     System.out.println("How much will I be accounting for you today?");
     final double bal = o.nextDouble();
     System.out.println("I will be managing "+bal+" dollars");
     int bananas = 0;
     double i = 0;
     for(i = bal; i>=2; i-=2)
     {
      bananas ++;
     }
     System.out.println(i);
     System.out.println("This may be off topic, but I could buy "+bananas+" banana(s) with that money!");
     System.out.println("For security purposes could I please get your name?");
     Scanner sc = new Scanner(System.in);
     String name = sc.nextLine();
     System.out.println("For security purposes could I please get your name again for confirmation?");
     String confirmation = sc.nextLine();
     Boolean isMatch = name.equals(confirmation);
     if(isMatch == true)
     {
       System.out.println("Hello "+name+ " let's proceed");
       System.out.println("How many months is this money supposed to last you?");
       int months = sc.nextInt();
       System.out.println("Alright, so its going to last you "+ months +" months");
       System.out.println("How much do you pay per month for your house or apartnment?");
       double rent = sc.nextDouble();
       System.out.println("that means you have $"+(bal-rent)+" left!"); 
       System.out.println("How much do you spend on utilities?");
       Lamp ywes = new Lamp("black", "plastic", 57.5);
       ywes.turnOnLamp();
       System.out.println("Hello, how much time do u use a lamp in a day?");
       int timeelec = o.nextInt();
       double brightn = (ywes.getBrightness());
       ywes.electricity(timeelec);
       System.out.println("This costs you about $"+(timeelec * timeelec *30)+" a day");
       ywes.ballJoint(7);
       System.out.println("Wowzers that's a lot of money" + "\"!");
       String lampp = "Sorry I cost so much :(";
       System.out.println(lampp.substring(6));
       System.out.println("how many days a week do you buy yourself a treat?");
       int days = o.nextInt();
       System.out.println("how many times a day do you buy yourself a treat?");
       int perd = o.nextInt();
       int total = 0;
       for(int p =days; p>0; p--)
       {
         for(int j=perd; j>0; j--)
         {
           total += 5;
         }
         System.out.println("day " +p+ " you used "+total+" dollars!");
       }
       System.out.println("lets see how much of a discount my boss will let me give you today!");
       int ran = 0;
       ran = ((int)(Math.random()*6));
       System.out.println(ran);
     }
     else
     {
       System.out.println("please redo");
     }
     }
   else if(age == 17)
   {
     System.out.println("Sorry you can't come in yet, just one more year!");
   }
   else if(age < 17)
   {
     System.out.println("Sorry, you aren't old enough. Come back when you're 18!");
   }
   else
   {
     System.out.println("Sorry, we are closed today, come back another time!");
   }
  }  
}
