package org.algoritms;
import java.util.Scanner;

public class Algoritm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();
        System.out.println();

        double sum = num1 + num2 + num3;
        System.out.println("Сумма трех чисел: " + sum);

        scanner.close();
    }
}
