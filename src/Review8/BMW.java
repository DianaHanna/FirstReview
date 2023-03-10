package Review8;

import Review7.Car;

public class BMW extends Car {
    public BMW(String make, String model) {
        super(make, model);
    }

    @Override
    public void start() {
        System.out.println(make+" starts with push start button");
    }

    public String drive(String typeOfDriving){
        System.out.println(make+" drives "+typeOfDriving);
        return typeOfDriving;
    }
void brake(){
    System.out.println(make+" brakes");
    }
}
