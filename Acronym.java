import java.util.ArrayList;
public class Acronym
{
  private String name;
  private String meaning;
  public Acronym(String str, String m)
  {
    name = str.toUpperCase();
    meaning = m;
  }
  public String getMeaning()
  {
    return meaning;
  }
  public String getName()
  {
    return name;
  }
}