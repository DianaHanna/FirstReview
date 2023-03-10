package class19;

public class BankAccount { // PARENT CLASS OR SUPER CLASS

    long accountNumber;
    double money;


    void deposit(){

        System.out.println("Deposit methods from Bank account class");
    }
}


class Checking extends BankAccount { // CHILD CLASS OR SUB CLASS OR DERIVED CLASS
    double interest;

    void transfer() {

        System.out.println("Transfer methods from Checking class");
    }
}
class Savings extends BankAccount {
    double profit;

    void takeProfit() {
        System.out.println("Profit method from Savings class");

    }
}

class SuperSavings extends Savings{

    void superSavings(){
        System.out.println("Super savings methods from SuperSavings class");
    }
}
