public class Main {
    public static void main(String[] args) {
        //Account bobsAccount = new Account("12345", 1000, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(1000);
        bobsAccount.withdrawFunds(500);
    }
}
