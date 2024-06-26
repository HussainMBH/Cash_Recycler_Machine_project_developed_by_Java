import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int addAmount = 0;
        int withdrawelAmount = 0;

        String name;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your pin number...");
        int password = scn.nextInt();

        if(password == pin){
            System.out.println("Enter your name: ");
            name = scn.next();
            System.out.println("Welcome " + name);

            while (true){
                System.out.println("MBH Bank");
                System.out.println("Press 1 to check your balance.");
                System.out.println("Press 2 to add amount.");
                System.out.println("Press 3 to withdrawal amount.");
                System.out.println("Press 4 to take recipt.");
                System.out.println("Press 5 to Exit.");

                int opt = scn.nextInt();
                if(opt == 5){
                    System.out.println("Thank you " + name + ", Come Again");
                    break;
                }
                switch (opt){
                    case 1:{
                        System.out.println("Your current balance is " + balance);
                        break;
                    }
                    case 2:{
                        System.out.println("How much amount you want to add?");
                        addAmount = scn.nextInt();
                        balance += addAmount;
                        System.out.println("Successfully credited your amount.");
                        System.out.println("Now your balance is " + balance);
                        break;
                    }
                    case 3:{
                        System.out.println("How much amount you want to take? ");
                        withdrawelAmount = scn.nextInt();
                        if(withdrawelAmount< balance){
                            System.out.println("Please take your " + withdrawelAmount + " money.");
                            balance -= withdrawelAmount;
                            System.out.println("Now your current balance is " + balance);
                        }
                        else {
                            System.out.println("sorry, your balance is insufficient, try less than your available balance.");
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("Hi " + name + ", Welcome to MBH Bank ATM");
                        System.out.println("Your available balance is " + balance);
                        System.out.println("Deposited amount is " + addAmount);
                        System.out.println("Your withdrawal amount is " + withdrawelAmount);
                        System.out.println("Thank you for coming...");
                        break;
                    }
                    default:{
                        System.out.println("Press the number below 5");
                        break;
                    }
                }
            }
        }
        else {
            System.out.println("Wrong PIN number, please enter correct PIN number");
        }
    }
}