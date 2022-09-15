public class Main {
    public static void main(String[] args) {
        //Ändra i ditt program så att du testar de nya metoderna. För att testa toString räcker det att du anropar

        Account billingAccount = new Account(30000);
        Account bilAccount = new Account();
        Account savingsAccount = new Account(100000);
        Account pensionAccount = new Account(50000);

        System.out.println(savingsAccount.getBalance());
        System.out.println(pensionAccount.getBalance());
        System.out.println(bilAccount.getBalance());

        double money = billingAccount.withdraw(18000);
        System.out.println(billingAccount.getBalance());
        savingsAccount.deposit(6000);
        bilAccount.deposit(6000);
        pensionAccount.deposit(6000);
        System.out.println(billingAccount.getBalance());
        System.out.println(savingsAccount.getBalance());
        System.out.println(pensionAccount.getBalance());








    }
}