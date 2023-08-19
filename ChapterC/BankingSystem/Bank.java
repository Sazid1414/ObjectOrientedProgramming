package ChapterC.BankingSystem;

import java.util.ArrayList;

public class Bank {

    String bankName;
    ArrayList<Customer>customers=new ArrayList<>();
    Bank(String bankName)
    {
        bankName=this.bankName;
    }
     void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    
}
