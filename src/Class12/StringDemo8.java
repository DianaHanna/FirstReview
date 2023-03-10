package Class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str = "Java is love";
        char character = str.charAt(2);
        System.out.println(character);
        System.out.println("************************");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("***********************");
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                count++;
        }
        System.out.println(count);
    }
}
