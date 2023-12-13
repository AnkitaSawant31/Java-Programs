package Sept16.String;

import java.util.Scanner;

public class Revercestring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        StringBuilder sb1;

        sb1 = new StringBuilder(sc.next());
        sb1.reverse();
        System.out.println(sb1);
    }
}
