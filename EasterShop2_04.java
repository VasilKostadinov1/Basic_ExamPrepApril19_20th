package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterShop2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEggs = Integer.parseInt(scanner.nextLine());
        int sumSold = 0;

        String command = scanner.nextLine();  //("Buy" или "Fill
        while (!command.equals("Close")) {
            int newEggs = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (initialEggs - newEggs < 0) {      // 8 - 10 eggs = -2 ; -> buy only 8 !!!
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", initialEggs);
                    break;
                }
                initialEggs -= newEggs;
                sumSold += newEggs;      // sold to customer, bought by customer
            } else if (command.equals("Fill")) {
                initialEggs += newEggs;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", sumSold);
        }

    }
}
