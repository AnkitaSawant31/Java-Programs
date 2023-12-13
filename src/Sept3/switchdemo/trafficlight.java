package Sept3.switchdemo;

import java.util.Scanner;

public class trafficlight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-3 in which state you are in");
        int state = sc.nextInt();

        switch (state) {
            case 1:
                System.out.println("Next will be Yellow");
                break;

            case 2:
                System.out.println("Next will be Green");
                break;

            case 3:
                System.out.println("Next will be Red");
                break;

            default:
                System.out.println("Invalid state");
        }
    }
}

