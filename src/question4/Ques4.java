package question4;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num=sc.nextInt();
        if(num==0)
            System.out.println("Zero.");
        else if(num>0)
            System.out.println("Positive.");
        else
            System.out.println("Negative.");
        sc.close();

    }
}
