public class Lamp
{
  private String color;
  private boolean on;
  private String material;
  private double brightness;
  
  public void lightUp()
  {
    System.out.println("\"It is now bright\"");
  }
  public void electricity(int i)
  {
    System.out.println("\"now using " + i * 0.005 + "$ per second\"");
  }
  public void ballJoint()
  {
    System.out.println("\"turns left\"");
  }
  public void turnOnLamp()
  {
    on = true;
    lightUp();
  }
  public Lamp(String c, String m, double p)
  {
    color = c;
    material = m;
    brightness = p;
  }
  public Lamp()
  {  }
  public String getmaterial()
   {
     return material;
   }
  public void ballJoint(int h)
  {
    System.out.println("\"I turned left " + h + " times!\"");
  }
  public double getBrightness()
  {
    return brightness;
  }
  public String toString()
  {
    return "\"I am very bright";
  }
}
