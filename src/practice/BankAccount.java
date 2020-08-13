package practice;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;


    public void setInfo(String accountHolder,long accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void getInfo(){

        System.out.println("Account Holder Name: "+ accountHolder+ ", Account Number: "+accountNumber+", Balance: $"+balance);
    }

   public void showBalance(){
       System.out.println("Balance is $"+balance);
   }

   public void  deposit(double money){
        balance += money;
       System.out.println("You have deposited $"+money+ " and your new balance is: $"+balance);
   }

   public void withdraw( double amount) {
       double penalty = 35;

       if (balance <= 100) {
           System.out.println("Insufficient funds, your transaction is declined ");

       } else if (amount > balance) {
           balance -= amount;
           balance -= penalty;
           System.out.println("You have been charged $" + penalty + " overdraft fee, your new balance is: $" + balance);

       } else if (amount < balance) {
           balance -= amount;
          System.out.println("You  have withdrawn $" + amount + ". Your new balance is $" + balance);
       }
   }

}
