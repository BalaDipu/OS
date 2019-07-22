package BankManagement;

public class Member {
        int balance=10000;

        public synchronized void withdraw(int amount) {

            System.out.println(Thread.currentThread().getName()+" ");
            if(balance>=amount)balance-=amount;
            System.out.println("current Balance: "+balance);
        }
}
