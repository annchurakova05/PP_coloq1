package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialCalculator.getRowOfFactorials(n));
        System.out.println(factorialCalculator.calculateFactorial(n));        }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}