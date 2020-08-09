package day39_CustomClass;

public class BankAccount {

    String accountName;
    long accountNumber;
    double balance;

    public void setBankInfo(String bankAccountName, long bankAccountNumber, double bankAccountBalance){

        accountName = bankAccountName;
        accountNumber = bankAccountNumber;
        balance = bankAccountBalance;

    }
    public void getBankInfo(){

        System.out.println(accountName+", "+accountNumber+", "+balance);
    }

    public void withdraw(){
        System.out.println("Withdrawing money from "+accountName+"\' bank account.");
    }

    public void deposit(){
        System.out.println("Depositing money to "+accountName+"\' bank account.");
    }

    public  void checkBalance(){
        System.out.println("Checking available balance in "+accountName+"\'s bank account.");
    }

}
