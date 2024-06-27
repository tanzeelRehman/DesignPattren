public class Demo {
    public static void main(String[] args) {
        Account account = new Account(1000);
        account.modify(-100);
        System.out.println(account.getBalance());
    }
}
