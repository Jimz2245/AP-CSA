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
    System.out.println(proto.translate("HML"));
    System.out.println(corpo.translate("HML"));
    System.out.println("What meaning would you like to find?");
    String str = sc.nextLine();
    System.out.println(corpo.translate(str));
  }
}