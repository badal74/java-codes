package CreditCardProject;

import java.util.Scanner;

public class SilverCard implements CreditCard{
    int limit = 50000;
    int wamt , damt , loan = 0;
    Scanner sc = new Scanner(System.in);
    @Override
    public void withdraw() {
        System.out.println("Enter Amount :");
        wamt = sc.nextInt();
        if(wamt > limit){
            System.out.println("Please Enter valid amount");
        }
        else{
            limit = limit - wamt;
            loan = loan + wamt;
        }
    }

    @Override
    public void deposite() {
        System.out.println("Enter Amount :");
        damt = sc.nextInt();
        if(damt  > loan){
            System.out.println("please enter valid amount");
        }
        else{
            limit = limit + damt;
            loan = loan - damt;
        }
    }

    @Override
    public void balance() {
        System.out.println("Limit : " + limit);
        System.out.println("Loan : " + loan);
    }

    @Override
    public void extendlimit() {
        System.out.println("Sorry you can not extend limit in Silver Card");
    }
}
