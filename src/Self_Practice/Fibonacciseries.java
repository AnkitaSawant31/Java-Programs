package Self_Practice;

public class Fibonacciseries {
    public static void main(String[] args) {

        //0,1,2,3,5,8,13...

        int a = 0;
        int b = 1;
        int c = 0;
        int count = 10;
        int counter = 0;

        System.out.print(a + "," + b + ",");

        while (counter < count - 2) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + ",");
            counter++;
        }
    }
}
