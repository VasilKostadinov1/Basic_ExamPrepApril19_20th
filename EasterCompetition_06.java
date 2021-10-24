package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int max = 0;
        String bestBaker = "";

        for (int i = 1; i <= cakes; i++) {
            String baker = scanner.nextLine();

            String command = scanner.nextLine();
            int sum = 0;
            while (!command.equals("Stop")) {
                int grade = Integer.parseInt(command);  //цяло число в интервала [1... 10]
                sum += grade;
                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", baker, sum);
            //Ако след командата "Stop", пекарят е с най-много точки до момента, да се отпечата допълнителен ред:
            if (sum > max) {
                max = sum;
                bestBaker = baker;
                System.out.printf("%s is the new number 1!%n", bestBaker);
            }
        }
        System.out.printf("%s won competition with %d points!", bestBaker, max);


    }
}
