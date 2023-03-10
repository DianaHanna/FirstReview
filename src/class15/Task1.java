package class15;

public class Task1 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
     your method should return
    complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    // return String
    // name createEmail()
    // parameter String

    String createEmail(String userName, String lastName, String emailType){
        return userName.toLowerCase() + lastName.toLowerCase() +"@" + emailType.toLowerCase()+".com";
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        System.out.println(task1.createEmail("john","snow","gmail"));
    }

}
