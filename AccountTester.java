import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountTester {

    public static void main(String[] args) {
       
        List <Account>accounts = new ArrayList<>();


        // Add account objects to the list
        
        accounts.add (new Account(1256999, "Marianne" , "Michelle", 20000000));
        accounts.add (new Account(1256999, "Sanaa" , "Siaha", 100000));
        accounts.add (new Account(1256999, "Eric" , "Ekra", 35000000));
        accounts.add (new Account(1256999, "Herman" , "Frank", 5000000));
        accounts.add (new Account(1256999, "Rose" , "Lima", 5500000));

        // Sorting the List: Use Collections.sort with the AccountComparator to sort the list in descending order of balance
        Collections.sort( accounts ,new AccountBalanceComparator());


        // Displaying the Sorted List: Iterate through the sorted list and print the account details.

        for (Account account : accounts){

            System.out.println(account);

        }








        
        
    }

}
