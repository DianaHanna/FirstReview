package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {


       int [] numbers=new int[5];
        numbers[0]=45; //45=0
        numbers[1]=44;
        numbers[2]=33; //45+33=78
        numbers[3]=20;
        numbers[4]=10; // 78+10=88

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {

            if (i%2==0){ // we used i because we want the even of the indexes NOT the numbers
                sum+=numbers[i];
            }
        }
        System.out.println(sum);
    }
}
