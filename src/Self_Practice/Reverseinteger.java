package Self_Practice;

import java.util.Scanner;

public class Reverseinteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your input");
        int input = sc.nextInt();
        int output = 0;

        while (input > 0)
        {
            int reminder = input%10;
            output = (output*10)+ reminder;
            input = input/10;
        }
        System.out.println("Your Reverse integer is = " +output);
    }
}
