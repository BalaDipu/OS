package BankManagement;

public class Bank extends Thread{
        Member c;

        int amount;

        public Bank(Member c,int amount,String name) {
            super.setName(name);
            this.c=c;
            this.amount=amount;

        }
        @Override
        public void run() {
            c.withdraw(amount);
        }


}
