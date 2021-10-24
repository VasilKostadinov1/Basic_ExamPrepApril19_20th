package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();  //France", "Italy" или "Germany"
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total=0;

        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    price=30;
                }else  if (dates.equals("24-27")) {
                    price=35;
                }else  if (dates.equals("28-31")) {
                    price=40;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    price=28;
                }else  if (dates.equals("24-27")) {
                    price=32;
                }else  if (dates.equals("28-31")) {
                    price=39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    price=32;
                }else  if (dates.equals("24-27")) {
                    price=37;
                }else  if (dates.equals("28-31")) {
                    price=43;
                }
                break;
        }
        total=price*nights;

        System.out.printf("Easter trip to %s : %.2f leva.",destination,total);


    }
}
