package Review8;

public class InsuranceTest {
    public static void main(String[] args) {

        //Can I create an object of Insurance class? No, since it's abstract

        Insurance carPolicy=new CarPolicy("I969696","Jon Snow",2412.00,25);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy=new PetPolicy("P986969","Olena",20,4);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());
    }
}
