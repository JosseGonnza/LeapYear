package org.jossegonnza;

public class LeapYear {

    public boolean isLeapYear(int year) {
        return divisibleBy(year, 4) && !(divisibleBy(year, 100) && notDivisibleBy(year, 400));
    }

    private static boolean notDivisibleBy(int year, int number) {
        return year % number != 0;
    }

    private static boolean divisibleBy(int year, int number) {
        return year % number == 0;
    }
}
