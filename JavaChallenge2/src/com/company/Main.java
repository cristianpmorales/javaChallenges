package com.company;

public class Main {

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(-5,6);
	    calcFeetAndInchesToCentimeters(1,6);
	    calcFeetAndInchesToCentimeters(1,-8);
	    calcFeetAndInchesToCentimeters(-5,-4);
        calcFeetAndInchesToCentimeters(7,5);
	    calcFeetAndInchesToCentimeters(53);
        calcFeetAndInchesToCentimeters(-5);
        calcFeetAndInchesToCentimeters(100);

    }
    public static int calcFeetAndInchesToCentimeters(double feet, double inches){
//Removing original logic to clean the code and adding Or statement so that each condition is checked on one line
//        if (feet <= 0 ){
//            System.out.println("Invalid");
//            return -1;
//        }else if (inches <= 0 && inches <= 12 ){
//            System.out .println("Invalid");
//            return -1;
        if ( (feet < 0) || (inches < 0) || (inches > 12)){
            System.out.println("Invalid Value");
            return -1;
        }
        double centimeters = (feet/0.032808) + (inches / 0.39370);
        System.out.println("feet " + feet + " inches " + inches + " is in cm " + centimeters);
        return 1;
    }
    public static int calcFeetAndInchesToCentimeters(double inches){
        if (inches <= 0 ){
            System.out.println("Invalid");
            return -1;
        }else {
// Commenting out code. Missed the (int) keyword that changes the double into an int. we need a whole number for inches
//            double newFeet = (inches / 12);
//            double newInches = (inches % 12);
            double newFeet = (int) inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " Inches converted to feet is " + newFeet + "and inches " + remainingInches);
            return calcFeetAndInchesToCentimeters(newFeet,remainingInches);
//          Instead of calling the method and then returning 1 it is possible to just return the method
//          calcFeetAndInchesToCentimeters(newFeet,remainingInches);
//          return 1;
        }
    }
}
