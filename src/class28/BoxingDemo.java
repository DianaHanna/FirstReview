package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer=new Integer(10);
        int number=integer; // auto-unboxing the wrapper is unwrapped and converted to object
        int number2=integer.intValue(); // unboxing manual

        double d=12.3;
        Double wrapperD=new Double(d); // boxing
        Double wrapperP=12.5; // autoboxing

        Float f=12f;
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(12.0f);

        double fg=12;
    }
}
