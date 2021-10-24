package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();   //текст ("Buy" или "Fill")
        int sum = 0;  // sum of sold eggs

        while (!input.equals("Close")) {
            int addEggs = Integer.parseInt(scanner.nextLine());
            if (initialEggs < addEggs && input.equals("Buy")) { //или при заявка за купуване на повече от наличните в магазина яйца)
                break;
            }
            if (input.equals("Buy")) {    // eggs sold
                initialEggs -= addEggs;   // + - + - ....
                sum += addEggs;          // sum of sold -, - ,-
            } else if (input.equals("Fill")) {
                initialEggs += addEggs;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", sum); //eggs sold
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", initialEggs);  // !!!
        }


    }
}
