import java.util.Random;
public class BankAccount{
    private double checkingBalance;
    private double savingBalance;
    public static int noOfAccounts = 0;
    public static double totalAmount = 0;
    private long accountNumber;

    public BankAccount(double checkingBalance, double savingBalance){
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.accountNumber = createAccountNumber();
        noOfAccounts++;
    }

    private long createAccountNumber(){
        Random rand = new Random();
        this.accountNumber = rand.nextInt(1000000000)+999999999;
        return this.accountNumber;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public void depositMoney(String typeOfAccount, double amount){
        if(typeOfAccount.equals("checking")){
            this.checkingBalance += amount;
        }
        else if(typeOfAccount.equals("savings")){
            this.savingBalance += amount;
        }
        totalAmount += amount;
    }

    public void withdrawMoney(String typeOfAccount, double amount){
        boolean success = false;
        if(typeOfAccount.equals("checking")){
            if(this.checkingBalance - amount >= 0){
                success = true;
                this.checkingBalance -= amount;
            }
        }
        else if(typeOfAccount.equals("saving")){
            if(this.savingBalance - amount >= 0){
                success = true;
                this.savingBalance -= amount;
            }
        }
        if(success){
            totalAmount -= amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    public void display(){
        System.out.println(String.format("Checking: %.2f Savings: %.2f", this.checkingBalance, this.savingBalance));
    }    
}
