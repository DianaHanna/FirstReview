package class27;

public class Demo2 {
    public static void main(String[] args) {

        String target = "Diana";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};

        System.out.println(contains(names,target));
        String[] arr=new String[5];
        names[4]="Shah";
    }
        public static boolean contains(String[]names, String target){
            for (String name : names) {
                if (name.equals(target)) {
                    return true;
                }
            }
            return false;
        }
    }
