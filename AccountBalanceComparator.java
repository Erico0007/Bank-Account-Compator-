
import java.util.Comparator;

// Create the Class AccountBlanceComparator  and immplement Account 

public class AccountBalanceComparator implements Comparator<Account> {

    //  Compare  according to the balance between two Account 
    @Override
    public int compare (Account a , Account b){
        return Double.compare (b.getBalance(),a.getBalance());
    }


}
