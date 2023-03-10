package class20;

public class SportTest {
    public static void main(String[] args) {

        Cricket cricket=new Cricket("Cricket","Pakistan","Green Helmet");
        cricket.display();

        Soccer soccer=new Soccer("Soccer", "Argentina","Oliver's",12);
        soccer.display();
        soccer.displayTeam();
    }
}
