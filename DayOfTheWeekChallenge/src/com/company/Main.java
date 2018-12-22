package com.company;

public class Main {
//    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//    The method should not return any value (hint: void)
//
//    Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//    Bonus:
//    Write a second solution using if then else, instead of using switch.
//    Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(4);
        printDayOfTheWeek(3);
        printDayOfTheWeek(1);

    }
    public static int printDayOfTheWeek(int day){
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a day");
                break;
        }
        if (day == 1 ){
            System.out.println("IF Monday");
            return 1;
        } else if (day == 2){
            System.out.println("IF Tuesday");
            return 1;
        } else if (day == 3){
            System.out.println("IF Wednesday");
            return 1;
        } else if (day == 4){
            System.out.println("IF Thursday");
            return 1;
        } else if (day == 5) {
            System.out.println("IF Friday");

        } else if (day == 6) {
            System.out.println("If Satur day");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
        System.out.println("Not a day IF");
        return 1;
    }
}
