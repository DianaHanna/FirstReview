package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="jhuehffsHGHmnj223147984!@#$";
        // replaces ALL uppercase letters from A-Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        // replaces ALL lowercase letters from a-z
        System.out.println(str.replaceAll("[a-z]","#"));
        // replaces ALL numbers from 0-9
        System.out.println(str.replaceAll("[0-9]","#"));
        // replaces ALL uppercase letters from A-Z and lowercase letters from a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        // replaces ALL uppercase letteers from A-Z, lowercase letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // DO NOT replaces ALL uppercase, lowercase and numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
    }
}
