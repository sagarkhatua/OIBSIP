import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        AtmOpInterface op= new AtmOpImpl();
        int id = 8583;
        int pin= 7686;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Atm id ");
        int enteredId = sc.nextInt();
        System.out.println("Enter Atm Pin");
        int enteredPin= sc.nextInt();
        if (enteredPin==pin && enteredId==id){
            System.out.println("Validation done");
            while (true){
                System.out.println("1. View Available Balance");
                System.out.println("2. Transaction History");
                System.out.println("3. Withdraw");
                System.out.println("4. Deposit");
                System.out.println("5. Transfer");
                System.out.println("6. Quit");
                System.out.println("Enter the choice: ");
                int ch = sc.nextInt();
                if (ch==1){
                  op.viewBalance();
                }
                else if (ch==2) {
                    op.transactionHistory();

                }
                else if (ch==3) {
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount=sc.nextDouble();
                    op.withdraw(withdrawAmount);

                }

                 else if (ch==4) {
                System.out.println("Enter how much amount you want to deposit");
                double depositAmount=sc.nextDouble();
                op.deposit(depositAmount);

                } else if (ch==5) {
                    System.out.println("Enter the Account no: ");
                    int ac = sc.nextInt();
                    System.out.println("Entered Account no is " + ac);
                    System.out.println("Enter the Amount:  ");
                    double amount= sc.nextDouble();
                    op.transfer(amount);

                } else if (ch==6) {
                    System.out.println("Thank-you for using Atm Machine");
                    System.exit(0);

                }
                else{
                    System.out.println("Enter a correct choice");

            }

        }

        }
        else
            System.out.println("Enter a valid id and pin");
        System.exit(0);
}
}
