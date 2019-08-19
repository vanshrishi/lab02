package question3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        System.out.println(value1+ " + " + value2 +" = " +(value1+value2));
        System.out.println(value1+ " * " + value2 +" = " +(value1*value2));
        System.out.println(value1+ " -  "+ value2 +" = " +(value1-value2));
        System.out.println(value1+ " / " + value2 +" = " +(value1/value2));
        System.out.println(value1+ " % "+  value2 +" = " +(value1%value2));
        sc.close();
    }
}
