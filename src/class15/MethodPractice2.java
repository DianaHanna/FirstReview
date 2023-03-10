package class15;

public class MethodPractice2 {

    // create a method that takes a String, reverse it and return the reversed String
    // call the method reverseStr

    /*String str="Sunday";
    for (int i =str.length()-1;i>0;i--){
        System.out.println(str.charAt(int));
     */

    // return String
    // parameter String
    // name reverseStr
    String reverseStr(String word) {
        String newStr="";
        for (int i = word.length() - 1; i >= 0; i--) {
            newStr+=word.charAt(i);
        }
        return newStr;
    }
    String reverseStr1(String word) {
        return new StringBuilder(word).reverse().toString();

    }
    String reverseStr2(String word) {
        StringBuilder stringBuilder=new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}

