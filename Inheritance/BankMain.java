class Bank{
    String bankName;

    void showBank(){
        System.out.println("Bank Name:" + bankName);

    }
}
class Account extends Bank{
    int accountNo;
    double balance;

    void showAccount(){
        showBank();
        System.out.println("Account No:" + accountNo);
        System.out.println("Balance:" + balance);

    }
}
class BankMain{
    public static void main(String[] args)
    {
        Account a = new Account();
        a.bankName = "Bank Of Maharashtra";
        a.accountNo = 123456;
        a.balance = 20000;

        a.showAccount();
    }
}