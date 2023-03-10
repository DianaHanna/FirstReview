package Review9;

public class Bank {
    public static void main(String[] args) {

        Customer customer=new Customer();
        customer.setName("Slava Friz");
        System.out.println(customer.getName());
        customer.setSsn(1112223333l);
        System.out.println(customer.getSsn());

        PrivateClient p=new PrivateClient("Diana Hanna",987654321l);
        System.out.println(p.getName());
        System.out.println(p.getSsn());

    }
}
