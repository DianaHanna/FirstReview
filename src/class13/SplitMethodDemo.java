package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {

        String str="I like java. I write a lot of code daily. I am from batch 15";
        String []strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        // whenever we are working with arrays we use length ONLY and with String we use length()
    }
}
