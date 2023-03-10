package class24;

public abstract class Phone {

    abstract void unlockPhone();
    abstract void sendText();
    abstract void displayPictures();
}
class Iphone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Face ID to unlock the phone");
    }

    @Override
    void sendText() {
        System.out.println("iMessage to send texts");
    }

    @Override
    void displayPictures() {
        System.out.println("Photos to browse the pictures");

    }

}
class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("FingerPrint sensor or camera");
    }

    @Override
    void sendText() {
        System.out.println("Message app to send the message");
    }

    @Override
    void displayPictures() {
        System.out.println("Gallery app to browse photos");
    }


    public static void main(String[] args) {

        Phone[] phones={new Iphone(), new Samsung()};
        for (Phone phone:phones) {
            phone.unlockPhone();
            phone.sendText();
            phone.displayPictures();
        }
    }
    }