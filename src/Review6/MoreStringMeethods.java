package Review6;

public class MoreStringMeethods {

    public static void main(String[] args) {

        String myString="Today is February 2";

        String [] strArray=myString.split(" ");
        for (String s:strArray) {
            System.out.println(s);
        }
        System.out.println(" ------------------------------------------ ");

        System.out.println(myString);

        String newStr=myString.substring(9);
        System.out.println(newStr);

        String newString=myString.substring(9,17);
        System.out.println(newString);

        int index=newStr.indexOf('b');
        System.out.println(index);

        String anotherStr="Today is Thursday";

        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is = "+index);

    }
}
