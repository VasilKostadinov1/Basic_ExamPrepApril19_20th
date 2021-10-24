package BASIC.Additional_Problems_MIX.ExamPrepApril19_20th;

import java.util.Scanner;

public class EasterEggs2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int countRed=0;
        int countOrange=0;
        int countBlue=0;
        int countGreen=0;
        int max=Integer.MIN_VALUE;
        String maxColour="";

        for (int i = 1; i <=count ; i++) {
            String colour = scanner.nextLine();  //red", "orange", "blue", "green
            if (colour.equals("red")){
                countRed++;
            } else if (colour.equals("orange")){
                countOrange++;
            }else if (colour.equals("blue")){
                countBlue++;
            }else if (colour.equals("green")){
                countGreen++;
            }
        }
        if (countRed>max){
            max=countRed;
            maxColour="red";
        }  if(countOrange>max){
            max=countOrange;
            maxColour="orange";
        }  if(countBlue>max){
            max=countBlue;
            maxColour="blue";
        } if(countGreen>max){
            max=countGreen;
            maxColour="green";
        }

        System.out.printf("Red eggs: %d%n",countRed);
        System.out.printf("Orange eggs: %d%n",countOrange);
        System.out.printf("Blue eggs: %d%n",countBlue);
        System.out.printf("Green eggs: %d%n",countGreen);
        System.out.printf("Max eggs: %d -> %s",max,maxColour);


    }
}
