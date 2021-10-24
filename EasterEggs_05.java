package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int max = Integer.MIN_VALUE;
        String maxColour="";

        for (int i = 1; i <=eggs ; i++) {
            String colour = scanner.nextLine(); //"red", "orange", "blue", "green"
            if (colour.equals("red")){
                redCount++;
            } else if (colour.equals("orange")){
                orangeCount++;
            }else if (colour.equals("blue")){
                blueCount++;
            }else if (colour.equals("green")){
                greenCount++;
            }

            if (redCount>max){
                max=redCount;
                maxColour=colour;
            }else if (orangeCount>max) {
                max = orangeCount;
                maxColour=colour;
            }else if (blueCount>max) {
                max = blueCount;
                maxColour=colour;
            }else if (greenCount>max){
                max=greenCount;
                maxColour=colour;
            }
        }
        System.out.printf("Red eggs: %d%n",redCount);
        System.out.printf("Orange eggs: %d%n",orangeCount);
        System.out.printf("Blue eggs: %d%n",blueCount);
        System.out.printf("Green eggs: %d%n",greenCount);

        System.out.printf("Max eggs: %d -> %s",max,maxColour);

    }
}
