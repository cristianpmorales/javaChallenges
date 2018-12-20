package com.company;

public class Main {
    //Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds
    //You should validate that the first parameter minutes is >= 0.
    //You should validate that the 2nd parameter seconds is >= 0 and <= 59.
    //The method should return gInvalid value h in the method if either of the above are not true.
    //If the parameters are valid then calculate how many hours minutes and seconds equal the minutes
    //and seconds passed to this method and return that value as string in format
    // gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.
    //Create a 2nd method of the same name but with only one parameter seconds.
    //Validate that it is >= 0, and return gInvalid valueh if it is not true.
    //If it is valid, then calculate how many minutes are in the seconds value and then call the other
    //overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
    //Call  both methods to print values to the console.
    //Tips:
    //	Use int or long for your number data types is probably a good idea.
    //	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
    //	Methods should be static as we have used previously.
    //Bonus:
    //	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
    //	Create a new console project and call it SecondsAndMinutesChallenge

    //Constant Variable
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        getDurationInt(-8,56);
        getDurationInt(8,65);
        getDurationInt(10,58);
        getDurationInt(65,50);
        getDurationInt(3600);
        getDurationInt(3605);
        getDurationInt(-40);
        getDurationString(50,-52);
        getDurationString(50,55);
        getDurationString(502,58);
        getDurationString(1000,50);
        getDurationString(1060,5);
        getDurationString(1085,9);
        getDurationString(3945);
    }

    public static String getDurationString(int mins, int secs){
        if ((mins < 0) || (secs < 0) || (secs > 59)){
            System.out.println("Invalid String No Bueno");
            return "Invalid";
        }

        int hours = mins / 60;
        int remaingMins = mins % 60;

        String hoursString = hours + "H";
        if (hours < 10) {
            hoursString = "0" + hours;
        }

        String minuteString = remaingMins + "M";
        if (remaingMins < 10 ){
            minuteString = "0" + remaingMins;
        }
        String secondString = secs + "S";
        if (secs < 10){
            secondString = "0" + secs;
        }
        System.out.println("Hour: " + hoursString + " minutes: " + minuteString + " seconds: " + secondString);
        return "Valid yo";
    }

    public static String getDurationString(int secs){
        if (secs < 0 ){
            System.out.println("No me gusta el segundo");
            return "invalid";
        }
        int minutes = secs / 60;
        int remainingSecs = secs % 60;
        return getDurationString(minutes,remainingSecs);
    }


// Used the wrong return value as the challenge asked for strings to be returned
    public static int getDurationInt (int minutes, int seconds){
        if ((minutes <=  0) || (seconds <= 0) || seconds >= 59){
            System.out.println("Not Valid stupid");
            return -1;
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println( "Hour: " + hour + " minutes: " + remainingMinutes + " seconds: " + seconds);
        System.out.println("Tots valid");
        return 1;
    }
    public static int getDurationInt (int seconds){
        if (seconds <= 0){
            System.out.println("No me gusta");
            return -1;
        }
        int newMinutes = seconds / 60;
        //Do not need this line since there is already a method to converts minutes to hours
        //Did not find solution for bonus section
        int newHours = seconds / 3600;
        int remainingSeconds = seconds % 60;
        if ((newMinutes == 60)){
            newMinutes = 0;
            System.out.println("New Hours: " +newHours + " New Minutes: " + newMinutes + " Remaining Seconds: " + remainingSeconds );

        }
        return 1;
    }
}
