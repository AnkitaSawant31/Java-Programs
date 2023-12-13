package Sept3.ifelse;

import java.util.Scanner;

public class Findmaxnowithscaner {

    public static void main(String[] args) {

        System.out.println("Enter the value of a,b,c\n I will find maximun number");

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b= in.nextInt();
        int c = in.nextInt();

        System.out.println("Your values are" +a + " "+b+ " "+c );

        if (a > b && a > c ){
            System.out.println("Max number is  "  + a);
        }

        if (b > a && b > c){
            System.out.println("Max number is"  +b);
        }

        if (c > a && c > b){

            System.out.println("Max number is"  +c);
        }
    }
}
