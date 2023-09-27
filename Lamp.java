public class Lamp
{
  private String color;
  private boolean on;
  private String material;
  private double brightness;
  
  public void lightUp()
  {
    System.out.print("It is now bright");
  }
  public void electricity()
  {
    System.out.print("now using your hard earned money on electricity");
  }
  public void ballJoint()
  {
    System.out.print("turns left");
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
}
  