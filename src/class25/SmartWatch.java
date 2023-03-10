package class25;
interface Washable{
    void wash(); // public and abstract by default
}
public class SmartWatch implements Washable{

    @Override
    public void wash() {

        System.out.println("You can wash this smartwatch without any issues");
    }
}
class Phone implements Washable{

    public void wash(){

        System.out.println("I am IP65 rated you can wash me");
    }
static class Inverter implements Washable{
    public void wash(){

        System.out.println("I am IP65 rated you can wash me");
    }
}
}