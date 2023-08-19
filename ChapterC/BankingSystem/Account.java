package ChapterC.BankingSystem;

public class Account {
    private int accountId;
    private double balance;
    Account(int accountId,double balance)
    {
        accountId=this.accountId;
        balance=this.balance;
    }

    public double getBalance() {
        return balance;
    }
    public int getAccountId()
    {
        return accountId;
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
        }
    }
    void withdraw(double amount)
    {
        if(balance<=amount)
        {
            balance-=amount;
        }
    }



}
