package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Does this work though? " + isPalidrome(707));
        System.out.print("Does this work though? " + isPalidrome(507));
        System.out.print("Does this work though? " + isPalidrome(907));

    }
    public static boolean isPalidrome(int number){
        int remainder, total = 0;
        while (number > 0) {
            System.out.println(number + " the fucking number");
            remainder = number % 10;
            System.out.println(remainder + "remainder");
            total = (total * 10) + remainder;
            System.out.println(total + "total");
            number /= 10;
        }
        if (number == total) {
            System.out.println("number is " + number + " reverse is " + total);
            return true;
        } else {
            System.out.println("number is " + number + " reverse is " + total);
            return false;
        }

    }
}
