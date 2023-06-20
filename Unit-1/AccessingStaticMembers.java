public class AccessingStaticMembers {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.balance = 11.7;

        account2.balance = 24.2;

        System.out.println(BankAccount.bankName);
    }
}

class BankAccount{
    static String bankName = "citi";
    Double balance;
}