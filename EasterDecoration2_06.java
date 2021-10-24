package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterDecoration2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clients = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalSum = 0;  // sum needed for calc. the Average; "tricky part"!!!

        for (int i = 1; i <= clients; i++) {
            String purchase = scanner.nextLine();  //("basket", "wreath" или "chocolate bunny"
            double sum = 0;    //sum initialized in the For, so - not needed to Zero it in the end(as do not have access to it anyway)
            int counter = 0;   //counter initialized in the For, so - not needed to Zero it in the end

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
                sum = sum * 0.80;    //от крайната цена-> out of the While (debug to see it)
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, sum);
            //counter = 0;
            totalSum += sum;  // before that accumulate that sum,as needed to calc. the average
            sum = 0;          // zero the sum per client
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / clients);
    }
}
