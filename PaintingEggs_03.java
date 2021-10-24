package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();     // Large", "Medium" или "Small"
        String colour = scanner.nextLine();   // Red", "Green" или "Yellow"
        int count12 = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total=0;

        switch (size) {
            case "Large":
                if (colour.equals("Red")) {
                    price = 16;
                } else if (colour.equals("Green")) {
                    price = 12;
                } else if (colour.equals("Yellow")) {
                    price = 9;
                }
                break;
            case "Medium":
                if (colour.equals("Red")) {
                    price = 13;
                } else if (colour.equals("Green")) {
                    price = 9;
                } else if (colour.equals("Yellow")) {
                    price = 7;
                }
                break;
            case "Small":
                if (colour.equals("Red")) {
                    price = 9;
                } else if (colour.equals("Green")) {
                    price = 8;
                } else if (colour.equals("Yellow")) {
                    price = 5;
                }
                break;
        }
        total=count12*price;
        double expense = total-total*0.35;
        double finalIncome = total*0.65;

        System.out.printf("%.2f leva.",finalIncome);


    }
}
