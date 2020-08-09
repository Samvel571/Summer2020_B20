package day39_CustomClass;

public class BankAccount_Objects {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setBankInfo("Jessica Alba",123456789, 2387654.54);

        bankAccount1.getBankInfo();

        bankAccount1.deposit();
        bankAccount1.withdraw();
        bankAccount1.checkBalance();


        System.out.println();
        System.out.println("======================================================================");

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setBankInfo("Al Pacino",00765423456, 12345653);

        bankAccount2.getBankInfo();
        bankAccount2.deposit();
        bankAccount2.withdraw();
        bankAccount2.checkBalance();









    }





}
