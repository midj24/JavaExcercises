/**
 * ovaj Unit test proverava inicijalno setovanje novca na racunu
 */
public class BankAccountTests {
    public static void runAllTests() {
        testStartBalance();
        testDepositSuccess();
        testDepositInvalidZero();
    }
    public static boolean testStartBalance() {
        double startBalance = 200;
        BankAccount account = new BankAccount(startBalance);

        double dobijeno = BankAccount.getBalance();
        if (dobijeno == startBalance) {
            System.out.println("StartBalance - PASS: start balance: "+dobijeno);
            return true;
        } else {
            System.out.println("StartBalance - FAIL: start balance: "+dobijeno+" expected: "+startBalance);
            return false;
        }
    }

    public static boolean testDepositSuccess () {
        double pocetnoStanje = 2000;
        BankAccount bankAccount = new BankAccount(pocetnoStanje);
        double uplata = 500;
        double ocekivano = pocetnoStanje + uplata;

        bankAccount.depozit(uplata);
        double novoStanje = bankAccount.getBalance();
        if  (novoStanje == ocekivano) {
            System.out.println("depozit - PASS: deposit success: " + novoStanje);
            return true;
        } else {
            System.out.println("depozit - FAIL: deposit expected: " + ocekivano + " current balance: " + novoStanje);
            return false;
        }
    }
    public static boolean testDepositInvalidZero () {
        // Given
        double pocetnoStanje = 2000;
        BankAccount bankAccount = new BankAccount(pocetnoStanje);
        double uplata = 0;
        boolean ocekivano = false;
        double ocekivanoStanje = 2000;
        // When
        boolean uspesnaUplata = bankAccount.depozit(uplata);
        // Then
        double dobijenoStanje = bankAccount.getBalance();
        if  (!uspesnaUplata && ocekivanoStanje == pocetnoStanje) {
            System.out.println("depozit - PASS: deposit invalid zero.");
            return true;
        } else {
            System.out.println("depozit - FAIL: deposit invalid zero, expected: "+ocekivanoStanje+ " dobijeno: "+dobijenoStanje);
            return false;
        }
    }

    }
