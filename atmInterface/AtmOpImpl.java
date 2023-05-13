import java.util.HashMap;
import java.util.Map;

public class AtmOpImpl implements AtmOpInterface {
    Atm atm=new Atm();
    Map<Double,String> transactionHistory=new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+ atm.getBalance());

    }

    @Override
    public void withdraw(double withdraw) {
       if (withdraw <= atm.getBalance()){
           transactionHistory.put(withdraw," Amount withdrawn");
           System.out.println("Collect the cash " + withdraw);
           atm.setBalance(atm.getBalance()-withdraw);
           viewBalance();
       }
         else {
           System.out.println("Insufficient Balance !! ");
       }
    }

    @Override
    public void deposit(double deposit) {
        transactionHistory.put(deposit," Amount Deposited");

        System.out.println(deposit+ "Deposited Successfully");
        atm.setBalance(atm.getBalance()+deposit);
        viewBalance();

    }

    @Override
    public void transactionHistory() {
        for (Map.Entry<Double,String> m :transactionHistory.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }

    }

    @Override
    public void transfer(double transfer) {
        if (transfer<= atm.getBalance()){
            transactionHistory.put(transfer," Transfer Amount");
            System.out.println("Transferred Amount"+ transfer);
            atm.setBalance(atm.getBalance()-transfer);
            viewBalance();

        }

    }
}
