package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        /*
        byte
        short
        int
        long
        float
        double
        if we try to store the contents from smaller box to larger box java doesn't complaint because the content can
        easily fit inside the larger box
        but if we try the other way around (to fit contents of larger to smaller) we get an error,and we need to
        type cast to store the contents
         */
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int newPrice=(int) eggs;
        System.out.println(eggs);
        System.out.println(newPrice);

        System.out.println((char) 97);


    }
}
