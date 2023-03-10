package Class12;

public class HouseTester {
    public static void main(String[] args) {

        House ranch=new House();
        ranch.type="Ranch";
        ranch.floors=3;
        ranch.color="BabyBlue";
        ranch.year=2022;
        ranch.howBig();
        ranch.condition();
    }
}
