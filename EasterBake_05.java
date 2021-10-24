package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {       // solved in 25 mins
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int sumSugar=0;
        int sumFlour=0;
        int maxSugar=Integer.MIN_VALUE;
        int maxFlour=Integer.MIN_VALUE;

        for (int i = 1; i <=cakes ; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            sumSugar+=sugar;
            sumFlour+=flour;
            if (sugar>maxSugar){
                maxSugar=sugar;
            }
            if (flour>maxFlour){
                maxFlour=flour;
            }
        }
        double sugarPackage= Math.ceil(1.00*sumSugar/950);
        double flourPackage= Math.ceil(1.00*sumFlour/750);

        System.out.printf("Sugar: %.0f%n",sugarPackage);
        System.out.printf("Flour: %.0f%n",flourPackage);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.",1.00*maxFlour,1.00*maxSugar);
    }
}
