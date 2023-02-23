package practice02;

import java.util.Scanner;

public class Q05 {
    /*
    Type code to do bank transactions below at an ATM:
	 Process 1: Balance inquiry
	 Process 2: Money withdrawal
	 Process 3: Deposit money
	 Process 4: End the process
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of process: "+"\n"+"Process 1: Balance inquiry"+"\n"+"Process 2: Money withdrawal"+"\n"+"Process 3: Deposit money"+"\n"+"Process 4: End the process");
        int process =scan.nextInt();
        int balance = 1000;

        switch(process){
            case 1:
                System.out.println("Your balance: "+balance);
                break;
            case 2:
                System.out.println("Enter the money you want to withdraw");
                int withdraw = scan.nextInt();
                if (withdraw<=balance) {
                    balance -= withdraw;
                    System.out.println("Your current balance after the withdrawal of " + withdraw + " : " + balance);
                }else {
                    System.out.println("Your balance is not enough");
                }
                break;
            case 3:
                System.out.println("Enter the amount of money you want to deposit.");
                int deposit = scan.nextInt();

                if (deposit>2000){
                    System.out.println("Daily limit of deposit money at the ATM: $2000");
                }else {
                    balance+= deposit;
                System.out.println("Your current balance after the deposit of $" + deposit+ " : $" + balance);}
                break;
            case 4:
                System.out.println("Thanks for using Techpro Bank." + "\n" + "Good Bye");
            default:
                System.out.println("Enter a valid number");


        }
    }
}
