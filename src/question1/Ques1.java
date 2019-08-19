package question1;

import java.util.Scanner;

public class Ques1 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String username;
        username = scanner.next().trim();
        System.out.println("Welcome," + username + "!");
        scanner.close();
    }
}
