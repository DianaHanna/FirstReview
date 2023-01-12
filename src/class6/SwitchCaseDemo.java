package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {


        String country = "italy";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) { //converts the text to lowercase USA=usa
            case "italy":
                System.out.println("Pasta");
                break;
            case "Afghanistan":
                System.out.println("Kabab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
    }