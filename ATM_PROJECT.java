package ATMMachine;
import java.util.*;
class ATM{
    float Balance;
    int pin=11052004;
    public void checkpin(){
        System.out.println("enter your pin :");
        Scanner sc=new Scanner(System.in);
        int enteredpin= sc.nextInt();
        if (enteredpin==pin){
            menu();
        }
        else{
            System.out.println("enter a valid pin");
        }
    }


    public void menu(){
        System.out.println("enter ypur choice");
        System.out.println("1. check a/c balance");
        System.out.println("2.withdrow Money");
        System.out.println("3.deposit money");
        System.out.println("4. exit");

        Scanner sc =new Scanner(System.in);
        int opt =sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrowMoney();
        }
        else if(opt==3){
            depositeMoney();

        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdrowMoney(){
        System.out.println("enter amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("money withdrawl successful");

        }
        menu();
    }
    public void depositeMoney(){
        System.out.println("Enter the amount :");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("money deposited successfully");
        menu();
    }

}
public class ATM_PROJECT {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();
    }

}
