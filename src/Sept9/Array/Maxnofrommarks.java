package Sept9.Array;

import java.util.Scanner;

public class Maxnofrommarks {

    public static void main(String[] args) {
        System.out.println("Enter subject count");
        Scanner sc = new Scanner(System.in);
        int total_subjects = sc.nextInt();

        int[] marks = new int[total_subjects];
        for (int i = 0; i < marks.length; i++) {

            System.out.println("Enter masks one by one");

            marks[i] = sc.nextInt();
        }
        System.out.println("Here is your marks");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Here is your marks of subject -> " + marks[i]);
        }
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("max is -> " +max);
    }
}

