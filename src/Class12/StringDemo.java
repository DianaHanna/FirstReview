package Class12;

public class StringDemo {
    public static void main(String[] args) {
        // this is how we create the object of the String class
          String strObj=new String("Java");
          // another (shorter) way of creating an object of String class
        // mostly this is how we create the objects of String class
          String strObj2="Java";
        System.out.println(strObj2.length());
        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name="Hamid Poya ";
        if (name.length()>10){
            System.out.println("Name cannot be more than 10 letters");
        }
    }
}
