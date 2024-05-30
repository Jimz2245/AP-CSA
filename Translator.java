import java.util.ArrayList;
public class Translator
{
  private static ArrayList<Acronym> list = new ArrayList<Acronym>();
  public String translate(String word)
  {
    word = word.toUpperCase();
    for(int i =0;i<list.size();i++)
    {
      if(word.equals(list.get(i).getName()))
      {
        return list.get(i).getMeaning();
      }
    } 
    return "Sorry, we cannot find this meaning :(";
  }
  public void addMeaning (String str, String mean)
  {
    str = str.toUpperCase();
    boolean bool = true;
    for(int i =0;i<list.size();i++)
    {
      if(str.equals(list.get(i).getName()))
      {
        bool = false;
      }
    } 
    if(bool)
    {
      list.add(new Acronym(str, mean));
      System.out.println(mean);
    }
    else
    {
      System.out.println("This acronym already exists");
    }
  }
}