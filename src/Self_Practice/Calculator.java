package Self_Practice;

import com.sun.tools.javac.Main;

public class Calculator {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int a=10; int b= 20;
        cal.add();
        sub();
        cal.mul();
        cal.div();

    }
void add ()
{
    int a=10,b=20;
    System.out.println("Addition is " + (a+b));
    }
public static void sub()
{
    int a=80,b=30;
    System.out.println("Subtraction is "+ (a-b));
}
void mul()
{
    int a=15,b=15;
    System.out.println("Multiplication is "+ (a*b));
}
void div()
{
    float a=15,b=2;
    System.out.println("Division is " +(a/b));
}
}
