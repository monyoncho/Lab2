public  abstract class Vehicle
{
   private String model;
   private String make;
   private String mileage;
   private int price;
     
    

    public Vehicle(String model, String make, String mileage, int price) 
    {
      this.model = model;
      this.make = make;
      this.mileage = mileage;
      this.price = price;
    }

       

    public abstract void accelarate();
    
    public abstract void stop();
    
    public abstract void gas();


    public Vehicle()
    {}    
    
}
