import java.util.Scanner;


public class ATM
{
    public static void main(String args[])
    {
        int balance=10000,withdraw,deposite;

        try (Scanner sc=new Scanner(System.in))
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposite");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform");

            int choice=sc.nextInt();

            switch(choice)
            {
                case 1: System.out.println("Enter money to be withdraw");

                withdraw = sc.nextInt();

                if(balance>=withdraw)
                {
                    balance=balance-withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;

                case 2: System.out.println("Enter money to be deopsited");

                deposite=sc.nextInt();

                balance=balance+deposite;
                System.out.println("Your money has been successfully deposited");
                break;

                case 3: System.out.println("Balance : "+balance);

                case 4: System.exit(0);

            }
            
        }
    }
}