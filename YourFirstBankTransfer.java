
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account a = new Account("Matthews account", 1000.00);
        Account b = new Account("My account", 0);
        a.withdrawal(100.00);
        b.deposit(100.00);
        System.out.println(a);
        System.out.println(b);
    }
}
