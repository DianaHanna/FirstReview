package class15;

public class MethodPractice {
    // create a method which returns true or false and take the int numbers as a parameter, if number is
    // even it returns true otherwise it returns false

    boolean isEven(int number) {
        boolean flag;
        if (number % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

boolean isEven1(int number){
            if (number % 2 == 0) {
               return true;
            } else {
                return false;
            }
        }
        boolean isEven2(int number){
        return number%2==0;
        }
    }
