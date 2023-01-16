package class9;

public class ArrayDemo7 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 4, 5, 6, 7, 80};

        int addition = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]% 2 == 0) {
                addition+=numbers[i]; // or addition=addition+numbers[i];

            }
        }
        System.out.println(addition);
    }
}