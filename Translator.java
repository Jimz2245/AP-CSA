import java.util.ArrayList;
public class Translator
{
   public String getMeaning()
  {
    return "placeholder";
  }
  ArrayList<String> list = new ArrayList<String>();
  public String translate(String str)
  {
    for(String stri : list)
    {
      if(stri.equals(str))
      {
        return "very cool";
      }
    } 
    return "Sorry, we cannot find this meaning :(";
  }
  public String addMeaning (String str, String mean)
  {
    new Acronym(str, mean);
    return "aaah";
  }
}
