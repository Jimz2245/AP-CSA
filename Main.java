import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Translator proto = new Translator();
    Translator corpo = new Translator();
    Acronym HML = new Acronym("HML", "Home Made Lies");
    proto.addMeaning("HML", "Home Made Lies");
    proto.addMeaning("kys", "Keep Yourself Safe");
    proto.addMeaning("ICL", "I Carry Lies");
    proto.addMeaning("LOL", "Lots of Love");
    proto.addMeaning("JK", "Just Killing");
    System.out.println(proto.translate("HML"));
    System.out.println(corpo.translate("HML"));
    boolean yesyes = true;
    while(yesyes)
    {
      System.out.println("Would you like to find or store?");
      
      String str1= sc.nextLine();
      if(str1.equals("find"))
      {
        System.out.println("What meaning would you like to find?");
        String str = sc.nextLine();
        System.out.println(corpo.translate(str ));
      }
      else if(str1.equals("store"))
      {
        System.out.println("What Acronym would you like to store?");
        String str = sc.nextLine();
        System.out.println("What is the meaning?");
        String str2 = sc.nextLine();
        corpo.addMeaning(str,str2);
      }
      else
      {
        System.out.println("Thank you for your time");
        yesyes = false;
      }
    }
  }
}