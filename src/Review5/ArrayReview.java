package Review5;

public class ArrayReview {
    public static void main(String[] args) {

        int a=10;
        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        //System.out.println(arr[3]); // RunTime error Index 3 out of bounds for length 3
        System.out.println("Size os the array ="+arr.length);

        // to get all value from the array?

       // arr[0];         arr[1];         arr[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int num:arr) {
            System.out.println(num);

        }

        String [] colors={"black","white","red","purple","blue"};
        // anytime we have arrays we can use enhanced for loop

        for(String color:colors){
            System.out.print(color+" ");
        }

        System.out.println("********************************");
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i]+" ");
        }
        System.out.println("--------- Printing in reverse -----------");

        for (int i = colors.length-1; i >=0 ; i--) { // to reverse the array.
            System.out.println(colors[i]);

        }

    }

    }




