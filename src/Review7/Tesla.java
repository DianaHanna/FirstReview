package Review7;

public class Tesla extends Car{


    // Tesla is a subclass of Car class
    // Car class is a superclass of Tesla

    String type; // declaring variables for child class
    boolean autoPilot;

   public Tesla(String make, String model, int year, int horsePower, String type, boolean autoPilot){
        super(make, model, year, horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }


    public void haveAutoPilot(){
        System.out.println(make+" have auto pilot "+autoPilot);
    }
    @Override
    public void start(){
        System.out.println(make+" starts automatically");
    }
}
