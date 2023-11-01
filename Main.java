import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
  {
   Scanner o = new Scanner(System.in);
   System.out.print("Hello! Welcome to the entrance to Cup Pong, how old are you?");
   final int age = o.nextInt(); //final means this value can't be changed, int means this is an integer value
   boolean open; //boolean means this is a true or false scenario
   open = true;
   System.out.println("you are "+age+" years old!");
   System.out.println("What is the fee?");
   final double fee = o.nextDouble();
   System.out.println("the fee is "+fee+" dollars");
   System.out.println("Cup Pong is "+open+" that the table is open");
   System.out.println("Welcome to cup pong, please input your username!");
   System.out.println();
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();
   System.out.println("Hello "+name+ " please throw your ball.");
   int cups = 10;
   int landed = 0;
   int missed = 3;   
   System.out.println("You landed it!");
   cups--;
   landed++;
   System.out.println(cups == (landed + missed));
   System.out.println("So far you have landed "+landed+" shots, and missed "+missed+" shots!");
   System.out.println(cups+" cups remain");
   double percent = (double)landed/(landed + missed);
   System.out.println("that means you have landed "+ 100*percent+" percent of your shots!"); 
   System.out.println("that is about "+(int)(100*percent + 0.5)+" percent!");
   Lamp ywes = new Lamp("black", "plastic", 57.5);
   ywes.turnOnLamp();
   System.out.println("Hello, how much electricity are you using per second?");
   int i = o.nextInt();
   ywes.electricity(i);
   ywes.ballJoint(7);
   System.out.println(ywes.getColor());
   System.out.println(ywes + "\"!");
   String lampp = "LIGHT LIGHT LIGHT";
   System.out.println(lampp.substring(6));
   System.out.println("lets play another game, lets roll a die and if its 4-6 I win, but if it's 1-3 you win!");
   int ran = 0;
   ran = ((int)(Math.random()+1))*6;
   System.out.println(ran);
  }
}