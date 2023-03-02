package rikkei.academy;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Chuyen tu do C sang do F");
            System.out.println("2. Chuyen tu do F sang do C");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("Hay nhap lua chon cua ban:");

            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhap do C can doi:");
                    celsius = input.nextDouble();
                    System.out.println("Do C sang do F la: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do F can doi:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Do F sang do C la: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lua chon sai vui long nhap lai");
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}