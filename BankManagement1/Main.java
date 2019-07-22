package BankManagement1;

public class Main {
    public static void main(String[] args) {

        Member c = new Member();
        Bank t1 = new Bank(c, 100, "Member 1");
        Bank t2 = new Bank(c, 400, "Member 2");
        Bank t3 = new Bank(c, 800, "Member 3");
        Bank t4 = new Bank(c, 1000, "Member 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
