package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import javax.swing.*;
import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double sum = 0;    //sum per client
        int counter = 0;
        double totalSum = 0;  // sum needed for calc. the Average; "tricky part"!!!

        for (int i = 1; i <= clients; i++) {
            String purchase = scanner.nextLine();  //("basket", "wreath" или "chocolate bunny"
            while (!purchase.equals("Finish")) {
                counter++;
                if (purchase.equals("basket")) {
                    price = 1.50;
                } else if (purchase.equals("wreath")) {
                    price = 3.80;
                } else if (purchase.equals("chocolate bunny")) {
                    price = 7.00;
                }
                sum += price;
                purchase = scanner.nextLine();
            }
            if (counter % 2 == 0) {  //всеки клиент закупил четен брой продукти, ще получи 20% отстъпка от крайната цена
                sum = sum * 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, sum);
            counter = 0;
            totalSum += sum;
            sum = 0;          // zero the sum per client
            // before that accumulate that sum,as needed to calc. the average
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / clients);


    }
}
