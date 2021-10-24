package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEggs = Integer.parseInt(scanner.nextLine());
        int secondEggs = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();  //"one" или "two"
        while (!command.equals("End of battle")) {
            if (command.equals("one")) {
                //firstEggs+=1;
                secondEggs -= 1;
            } else if (command.equals("two")) {
                firstEggs -= 1;
                //secondEggs+=1;
            }
            if (firstEggs == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", secondEggs);
                break;
            }
            if (secondEggs == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", firstEggs);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", firstEggs);
            System.out.printf("Player two has %d eggs left.", secondEggs);
        }


    }

}
