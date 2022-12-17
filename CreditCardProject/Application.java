package CreditCardProject;
import java.util.Scanner;
public class Application {
    public static void main(String args[]) {
        int choice1, choice2;
        Scanner sc = new Scanner(System.in);
        CreditCard golden = new GoldenCard();
        CreditCard silver = new SilverCard();
        do {
            System.out.println("___________________________________");
            System.out.println("1. Golden Card \n 2. Silver Card \n 3. Exit");
            System.out.println("Enter the choice : ");
            choice1 = sc.nextInt();

                switch (choice1) {
                    case 1:
                        System.out.println("--------__________-----------");
                        System.out.println("********--Golden Card--********");
                        do {
                            System.out.println(" 1. Check Balance \n 2. Withdraw \n 3. Deposit \n 4.Extend limit \n 5. Exit");
                            System.out.println("Enter the choice:");
                            choice2 = sc.nextInt();

                            switch (choice2) {
                                case 1:
                                    golden.balance();
                                    break;

                                case 2:
                                    golden.withdraw();
                                    break;

                                case 3:
                                    golden.deposite();
                                    break;

                                case 4:
                                    golden.extendlimit();
                                    break;

                                case 5:
                                    System.out.println("Thank you ..");
                                    break;

                                default:
                                    System.out.println("Please enter valid choice .. ");
                                    break;

                            }
                        } while (choice2 != 5);
                            break;


                    case 2:
                        System.out.println("--------__________-----------");
                        System.out.println("********--Silver Card--********");
                        do {
                            System.out.println(" 1. Check Balance \n 2. Withdraw \n 3. Deposit \n 4.Extend limit \n 5. Exit");
                            System.out.println("Enter the choice:");
                            choice2 = sc.nextInt();

                            switch (choice2) {
                                case 1:
                                    silver.balance();
                                    break;

                                case 2:
                                    silver.withdraw();
                                    break;

                                case 3:
                                    silver.deposite();
                                    break;

                                case 4:
                                    silver.extendlimit();
                                    break;

                                case 5:
                                    System.out.println("Thank you ..");
                                    break;

                                default:
                                    System.out.println("Please enter valid choice .. ");
                                    break;

                            }
                        } while (choice2 != 5);
                         break;

                    case 3:
                        System.out.println("Thank You ..");
                        break;

                    default:
                        System.out.println("Please Enter valid Choice .. ");
                        break;

                }
            } while (choice1 != 3);


    }

}
