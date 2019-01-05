package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        -Read the numbers from the console entered by the user
//        and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message gEnter number:h
//        -If the user enters an invalid number, break out of the loop
//        and print the minimum and maximum number.
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0 , maxNumber = 0;
        boolean firstTime = true;
        System.out.println("Please enter a number ");

        while(true){
            boolean isNumber = scanner.hasNextInt();

            if (isNumber){
                int number = scanner.nextInt();
                if (firstTime){
                    firstTime = false;
                    minNumber = number;
                    maxNumber = number;
                }

                if (number > maxNumber){
                    maxNumber = number;
                }
                if (number < minNumber){
                    minNumber = number;
                }
//                Logic was not set for the flag of the first number entered
//                maxNumber = number;
//                minNumber = number;
//                if (number < maxNumber){
//                    minNumber = numb er;
//                }
                System.out.println("Entered Number: " + number);


            }else{
                break;
            }
        }
        System.out.println("Max is " + maxNumber + " Min is " + minNumber );
        scanner.nextLine();
        scanner.close();
    }
}
