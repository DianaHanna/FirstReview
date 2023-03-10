package class19;

public class DonkeyTest {

    public static void main(String[] args) {

        //Donkey donkey=new Donkey();
        // default constructor creates by the compiler when a programmer doesn't create one
        Donkey donkey=new Donkey("Pepper",3); // the moment you create a constructor compiler doesn't give any DEFAULT constructor
        donkey.print();
        // since we haven't assign values compiler assign default values null and 0
    }
}
