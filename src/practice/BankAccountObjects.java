package practice;

public class BankAccountObjects {

    public static void main(String[] args) {


        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Mahfooz Parwani",123678998,100);
        bankAccount1.getInfo();


       bankAccount1.showBalance();

       bankAccount1.deposit(45);

       bankAccount1.withdraw(200);

       bankAccount1.withdraw(100);

       bankAccount1.deposit(300);

       bankAccount1.withdraw(200);


    }


}
