public class TestBankAccount{
    public static void main(String[] args){
        BankAccount accountOne = new BankAccount(0, 0);
        System.out.println("Account Number " + accountOne.getAccountNumber());
        accountOne.depositMoney("checking", 100.50);
        accountOne.depositMoney("savings", 50.50);
        accountOne.display();
        System.out.println(accountOne.totalAmount);
        accountOne.withdrawMoney("checking", 100.50);
        accountOne.display();
        accountOne.withdrawMoney("saving", 50.50);
        accountOne.display();
        accountOne.withdrawMoney("saving", 50.50);
    }
}