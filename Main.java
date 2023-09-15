import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
  {
   final int age = 18; //final means this value can't be changed, int means this is an integer value
   double fee; //double means that this is a decimal value
   fee = 2.50; 
   boolean open; //boolean means this is a true or false scenario
   open = true;
   System.out.println("you are "+age+" years old!");
   System.out.println("the fee is "+fee+" dollars");
   System.out.println("it is"+open+" that the table is open");
   
   System.out.println("Welcome to cup pong, please input your username!");
   System.out.println();
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();
   System.out.println("Hello "+name+ " please throw your ball.");
   int cups = 10;
   int landed = 0;
   int missed = 0;
   System.out.println("You landed it!");
   cups--;
   landed++;
   System.out.println("So far you have landed "+landed+" shots, and missed "+missed+" shots!");
   System.out.println(cups+" cups remain");
   double percent = landed/(landed + missed);
   System.out.println("that means you have landed "+ 100*percent+" percent of your shots!"); 

  }
}