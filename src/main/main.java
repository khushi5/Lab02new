package main;

import java.util.Scanner;

/**
 * @author KHUSHI
 * @version 1.0
 */
public class main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine().trim();
        System.out.println("Welcome" + userName + "!");
        System.out.println("ho gyaaa!!");
        scanner.close();

    }
}
