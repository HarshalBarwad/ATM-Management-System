import java.util.*;
public class atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bal = 50000;
        // atm Details
        System.out.println("----------ATM Management----------");
        System.out.println("Enter Card Number:- xxxxxxxx____");
        int card = sc.nextInt();
        System.out.println("Enter mpin:- ");
        int mpin = sc.nextInt();
        System.out.println("----------Applications----------\n1. Check Balance\n2.Transactions\n3.Transfer\n4.Card Transfer");
        
        while(true){
            System.out.println("Enter Operation Number:- ");
            int op = sc.nextInt();

            switch(op){
                case 1:System.out.println("Available Balance:- "+bal);
                break;
                case 2:System.out.println("Raju Bhai Credit 500000 to "+card);
                break;
                case 3:System.out.println("Enter Amount:- ");
                int am = sc.nextInt();
                System.out.println("Enter Person Card Number");
                int pc = sc.nextInt();
                System.out.println("Successfully Transfer to "+pc);
                int aa = bal-am;
                System.out.println("Available Balance "+aa);
                break;
            }
        }
    }
}