public class Candy
{
  private static int supply;
  private int weight;
  private String name;
  public Candy(int w, String n)
  {
    weight = w;
    name = n;
    supply++;
  }
  public void bundle(int i)
  {
    supply += i/weight;
    weight += i;
  }
  public void sell(int i)
  {
    supply -= i;
    weight -= i*weight;
  }
}