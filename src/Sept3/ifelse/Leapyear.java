package Sept3.ifelse;

public class Leapyear {

    public static void main(String[] args) {

        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0)){

            System.out.println("This is Leap Year");
        }
        else{

            System.out.println("This is not a Leap Year");
        }
    }
}
