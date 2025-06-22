public class BankManager {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("CHK123", 1000, 500);
        SavingsAccount savings = new SavingsAccount("SAV123", 2000);
        COD cod = new COD("COD123", 5000);

        checking.withdraw(1300); // utilise la limite
        savings.deposit(300);
        cod.withdraw(2000);

        System.out.println("Compte courant: " + checking.getBalance());
        System.out.println("Compte épargne: " + savings.getBalance());
        System.out.println("Certificat de dépôt: " + cod.getBalance());
    }
}
