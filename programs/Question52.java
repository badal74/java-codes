/*
============================================================================
Q.52 Interface program in java
============================================================================

Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car, and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks . Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.
*/

import java.util.Scanner;

public class Question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Select type of vehicle: ");
        System.out.println("1. Bicycle");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        boolean flag = true;
        switch (choice){
            case 1:
                Bicycle bi = new Bicycle();
                while(flag){
                    displayChoices();
                    int ch = sc.nextInt();
                    switch (ch){
                        case 1:
                            System.out.print("Enter the number of gear: ");
                            int gear = sc.nextInt();
                            bi.changeGear(gear);
                            bi.displayState();
                            break;
                        case 2:
                            System.out.print("Enter the speed to increment: ");
                            int inc = sc.nextInt();
                            bi.speedUp(inc);
                            bi.displayState();
                            break;
                        case 3:
                            System.out.print("Enter the speed to decrement: ");
                            int dec = sc.nextInt();
                            bi.applyBrakes(dec);
                            bi.displayState();
                            break;
                        case 4:
                            bi.displayState();
                            break;
                        default:
                            flag = false;
                    }
                }
                break;
            case 2:
                Bike b = new Bike();
                flag = true;
                while(flag){
                    displayChoices();
                    int ch = sc.nextInt();
                    switch (ch){
                        case 1:
                            System.out.print("Enter the number of gear: ");
                            int gear = sc.nextInt();
                            b.changeGear(gear);
                            b.displayState();
                            break;
                        case 2:
                            System.out.print("Enter the speed to increment: ");
                            int inc = sc.nextInt();
                            b.speedUp(inc);
                            b.displayState();
                            break;
                        case 3:
                            System.out.print("Enter the speed to decrement: ");
                            int dec = sc.nextInt();
                            b.applyBrakes(dec);
                            b.displayState();
                            break;
                        case 4:
                            b.displayState();
                            break;
                        default:
                            flag = false;
                    }
                }
                break;
            case 3:
                Car c = new Car();
                flag = true;
                while(flag){
                    displayChoices();
                    int ch = sc.nextInt();
                    switch (ch){
                        case 1:
                            System.out.print("Enter the number of gear: ");
                            int gear = sc.nextInt();
                            c.changeGear(gear);
                            c.displayState();
                            break;
                        case 2:
                            System.out.print("Enter the speed to increment: ");
                            int inc = sc.nextInt();
                            c.speedUp(inc);
                            c.displayState();
                            break;
                        case 3:
                            System.out.print("Enter the speed to decrement: ");
                            int dec = sc.nextInt();
                            c.applyBrakes(dec);
                            c.displayState();
                            break;
                        case 4:
                            c.displayState();
                            break;
                        default:
                            flag = false;
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("Program Exited!");
    }
    static void displayChoices(){
        System.out.println();
        System.out.println("1. Gear Change");
        System.out.println("2. Speed up");
        System.out.println("3. Apply brakes");
        System.out.println("4. Show Status");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}

interface Vehicle{
    void changeGear(int a);
    void speedUp(int sp);
    void applyBrakes(int sp);
    void displayState();
}

class Bicycle implements Vehicle{
    private int gear;
    private int speed;
    Bicycle() {
        speed = 0;
        gear = 1;
        System.out.println("Bicycle running.....");
    }
    public void changeGear(int a){
        if(a == 0){
            System.out.println("Gear can't be changed to zero!");
        } else if(a > 6) {
            System.out.println("Maximum gear no. if 6!");
        } else {
            gear = a;
        }
    }

    public void speedUp(int sp){
        if(speed + sp > 60){
            System.out.println("Maximum speed for bicycle is 60!");
        } else {
            speed += sp;
        }
    }

    public void applyBrakes(int dec){
        if(speed - dec <= 0){
            System.out.println("Bicycle stopped!");
            speed = 0;
        } else {
            speed -= dec;
        }
    }

    public void displayState() {
        System.out.println("Bicycle status:");
        System.out.println("Speed: " + speed + " km/hr  and Gear: " + gear);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;
    Bike(){
        speed = 0;
        gear = 1;
        System.out.println("Bike running......");
    }

    public void changeGear(int a){
        if(gear == 0){
            System.out.println("Bike gear shifted to neutral..");
            speed = 0;
        } else if(gear > 5){
            System.out.println("Maximum gear for bike is 5 th!");
        } else {
            gear = a;
        }
    }

    public void speedUp(int sp){
        if(gear == 0){
            System.out.println("Bike is on neutral...");
            return;
        }
        if(speed + sp > 100){
            System.out.println("Maximum speed for bike is 100!");
        } else {
            speed += sp;
        }
    }

    public void applyBrakes(int a){
        if(speed - a <= 0){
            System.out.println("Bike stopped...");
            speed = 0;
        } else {
            speed -= a;
        }
    }

    public void displayState() {
        System.out.println("Bike status:");
        System.out.println("Speed: " + speed + " km/hr and Gear: " + gear);
    }
}

class Car implements Vehicle {
    int speed;
    int gear;
    Car(){
        speed = 0;
        gear = 1;
        System.out.println("Car running...");
    }

    public void changeGear(int a){
        if(a > 5){
            System.out.println("Maximum gear no. is 5!");
        } else if(a == 0){
            System.out.println("Car shifted to neutral...");
            gear = 0;
        } else {
            gear = a;
        }
    }

    public void speedUp(int sp){
        if(gear == 0){
            System.out.println("Car is on neutral...");
            return;
        }
        if(speed + sp > 120){
            System.out.println("Maximum speed for car is 120!");
        } else {
            speed += sp;
        }
    }

    public void applyBrakes(int a){
        if(speed - a <= 0){
            System.out.println("Car stopped...");
            speed = 0;
        } else {
            speed -= a;
        }
    }

    public void displayState() {
        System.out.println("Car status:");
        System.out.println("Speed: " + speed + " km/hr and Gear: " + gear);
    }
}