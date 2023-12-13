package Self_Practice;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {

        //153= if 1*1*1+5*5*5+3*3*3=153 then no is armstrong

        int input = 153;
        int number = input;
        int output = 0;

        while (input > 0) {
            int rem = input % 10;
            output = output + (rem * rem * rem);
            input = input / 10;
        }
        if (number == output) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}
