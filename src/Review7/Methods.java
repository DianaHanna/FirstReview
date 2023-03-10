package Review7;

public class Methods {

    // user defined methods: with return type and without
    //                       with parameters and without



    void hello(){ // without parameters
        System.out.println("Hello");
    }

    void sayHello(String name){ // with parameter
        System.out.println("Hello "+name);
    }

    // create a method that returns the largest number between given 2 integer values

    int findLargest(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
           return num2;
        }
    }

    // create a method that returns an average value of 2 decimal values

    double findAverage(double num1, double num2){
        return (num1+num2)/2;
    }

    // returns revers String from a given String

    StringBuilder reverse(String given){
        StringBuilder sb=new StringBuilder(given);
        return sb.reverse();
    }

    // create a method that will return a min value from given array
    public static int findMin(int[] array) {
        int min=array[0] ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        String name="Mohamed";

        int characters=name.length(); // return method
        System.out.println(characters);

        Methods methods=new Methods();
        methods.sayHello(name); // non-return method

        System.out.println("   ********************************    ");
        int largest= methods.findLargest(100,200);
        System.out.println("The largest number is "+largest);

        System.out.println(methods.findAverage(10,30)); // methods is the variable

        StringBuilder reverse=methods.reverse("Thursday");
        System.out.println(reverse);

        String myString="Batch15";
        boolean empty=myString.toUpperCase().isEmpty();
        System.out.println(empty);

        char c=myString.trim().charAt(2);
        System.out.println(c);

        System.out.println("   **************************   ");
        int[] array={10,49,89,60};
        Methods.findMin(array);
        int minimum=findMin(array);
        System.out.println("Min number ="+minimum);
    }
}
