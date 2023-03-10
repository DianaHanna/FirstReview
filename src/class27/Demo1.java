package class27;

public class Demo1 {
    public static void main(String[] args) {

        String name1="Zafar";
        String name2="Aiperi";
        String name3="Sarah";


        System.out.println("******************************************");
        String[] names={"Hiral" , "Nima", "Laura", "Nat"};
        displayNames(names);
        displayNames(name1,name2,name3);

    }
    public static void  displayNames(String[] names){
        for (String name:names) {
            System.out.println(name);
        }
    }
    public static void displayNames(String name1, String name2, String name3){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
