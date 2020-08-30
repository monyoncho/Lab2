public class MainClass {

    
    public static void main(String[] args) {
        Sedan sedan1 =new Sedan();
        Vehicle sedan2 = new Sedan();
        Automobile sedan3 = new Sedan();

        //Method overloading
        sedan1.accelerate(200);

        //Method Overriding
        sedan2.stop();;
        
    }
    
}
