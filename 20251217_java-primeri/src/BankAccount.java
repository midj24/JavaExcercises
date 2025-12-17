public class BankAccount {

    private static double balance;

    public BankAccount(double startBalance) {
        if (startBalance >= 0) {
            this.balance = startBalance;
        }
    }

    /**
     *   Metoda za proveru stanja racuna
     */
    public static double getBalance() {
        return balance;
    }

    /**
     * Unosi vrednost na racun
     */
    public boolean depozit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Preuzimanje novca sa racuna
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
