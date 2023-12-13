package Sept3.switchdemo;

import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Scanner;

public class findvowelornot {

    public static void main(String[] args) {
        System.out.println("Enter a char");
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        c = c.toLowerCase(Locale.ROOT);

        switch (c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("It is a Vowel");
                break ;

            default :

                System.out.println("It is not a Vowel");
        }
    }
}
