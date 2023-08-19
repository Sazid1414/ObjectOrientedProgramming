package ChapterC.BankingSystem;

import java.util.ArrayList;

public class Customer {
   private int customerId;
   private String name;
    ArrayList<Account>accounts=new ArrayList<>();
    Customer(int customerId,String name)
    {
        customerId=this.customerId;
        name=this.name;
    }
   void addAccount(Account account)
   {
       accounts.add(account);
   }
   public int getAccountById(int accountId)
   {
       return 0;
   }
   public double getTotalBalance()
   {
      // return accounts.get(accounts.balance);
       return 0;
   }


}
