class Car{
    public void start()
    {
      System.out.println("Car started");
    }
    public void accelerate()
    {
      System.out.println("Car is accelerated");
    }
    public void changegear()
    {
      System.out.println("Car gear changed");
    }

}

class Luxurycar extends Car
{
   public void changegear()
   {
      System.out.println("Car gear changed");
   }
   public void openroof()
   {
    System.out.println("Sun roof is opened");
   }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.accelerate();
        c.changegear();

        Luxurycar c1=new Luxurycar();
        c1.changegear();

        Car c2=new Luxurycar();
        c2.changegear();
        
        

    }
    
}
