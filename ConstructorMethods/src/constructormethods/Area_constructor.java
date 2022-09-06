package constructormethods;

import java.util.Scanner;

public class Area_constructor {

    int len, width, Area;
    Scanner sr = new Scanner(System.in);

    Area_constructor(int lengt, int widt) {
        len = lengt;
        width = widt;
        Area = lengt * widt;
    }

    public void run() {
        System.out.println("The Area is " + Area);
    }

    public static void main(String[] args) {
        Area_constructor ob1 = new Area_constructor(10, 20);
        ob1.run();

    }
}
