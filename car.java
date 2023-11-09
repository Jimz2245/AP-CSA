public class car
{
  private String color;
  private boolean on;
  private String material;
  private double cost;
  private double tank;
  
  public void drive()
  {
    System.out.println("\"Vroom Vroom\"");
  }
  public void fillUp(int i)
  {
    System.out.println("\"Just spent " + i * 3.45 + "$ on gas!\"");
    tank += i;
  }
  public void insurance()
  {
    System.out.println("\"bank - $50\"");
  }
  public void noGas()
  {
    on = false;
    fillUp();
  }
  public Car(String c, String m, double p, double t)
  {
    color = c;
    material = m;
    cost = p;
    tank = t; 
  }
  public Car()
  {  }
  public String getmaterial()
   {
     return material;
   }
  public void drive(int h)
  {
    System.out.println("\"I used " + h/20 + " gallons of gas!\"");
    tank -= (h/20)
  }
  public String getColor()
  {
    return color;
  }
  public String toString()
  {
    return "\"I am very cool\"";
  }
}