package BankManagement1;

public class Member{
    int balance=10000;
    public static boolean flag=true;



    public void withdraw(int amount){

        flag=false;

        System.out.println(Thread.currentThread().getName()+" ");
        if(balance>=amount)balance-=amount;
        System.out.println("current Balance: "+balance);

        flag = true;

    }

    public void Control(int amount) {



              while(!flag)System.out.println("waiting "+Thread.currentThread().getName());
              withdraw(amount);




    }

}
