public class Demo {

    public static void main(String[] args) {

        DigitalWallet wallet1 = new DigitalWallet();
        DigitalWallet wallet2 = new DigitalWallet();

        System.out.println("wallet1 deposit(500): "
                + wallet1.deposit(500));
        System.out.println("Balance: "
                + wallet1.getBalance());

        System.out.println("wallet1 deposit(-10): "
                + wallet1.deposit(-10));
        System.out.println("Balance: "
                + wallet1.getBalance());

        System.out.println("wallet1 spend(200): "
                + wallet1.spend(200));
        System.out.println("Balance: "
                + wallet1.getBalance());

        System.out.println("wallet1 spend(1000): "
                + wallet1.spend(1000));
        System.out.println("Balance: "
                + wallet1.getBalance());

        System.out.println("Can afford 301: "
                + wallet1.canAfford(301));

        System.out.println("wallet1 spend(300): "
                + wallet1.spend(300));
        System.out.println("Balance: "
                + wallet1.getBalance());

        System.out.println("\nWallet 2 balance: "
                + wallet2.getBalance());
    }
}