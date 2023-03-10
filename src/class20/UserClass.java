package class20;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     create a subclass userInfo that will have user address variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */

     String name;
    long mobileNumber;

    public UserClass(String name, long mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

 class UserInfo extends UserClass {
    String address;

    public UserInfo(String name, long mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;

    }

    public void userDetails() {
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        UserInfo user = new UserInfo("John", 1234567890, " 1544 Sunbow St");
        user.userDetails();
    }
}
