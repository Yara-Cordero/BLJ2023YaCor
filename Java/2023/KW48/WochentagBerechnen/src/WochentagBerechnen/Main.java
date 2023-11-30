package WochentagBerechnen;

public class Main {

    private static String wochentagBerechnen(String date) {

        String[] dateString = date.split("\\.");

        int day = Integer.parseInt(dateString[0]);
        int month = Integer.parseInt(dateString[1]);
        int year = Integer.parseInt(dateString[2]);

        int yearLastTwoDigits = year % 100;

        yearLastTwoDigits = yearLastTwoDigits + (yearLastTwoDigits / 4);

        int monthCheck = 0;
        switch (month){
            case 1, 10:
                monthCheck = 1;
                break;
            case 2, 3, 11:
                monthCheck = 4;
                break;
            case 5:
                monthCheck = 2;
                break;
            case 6:
                monthCheck = 5;
                break;
            case 8:
                monthCheck = 3;
                break;
            case 9, 12:
                monthCheck = 6;
                break;
            default:
                monthCheck = 0;
                break;
        }

        yearLastTwoDigits = yearLastTwoDigits + monthCheck + day;

        int century = year / 100;
        int centuryCheck = 0;

        switch (century){
            case 18:
                centuryCheck = 2;
                break;
            case 19:
                centuryCheck = 0;
                break;
            case 20:
                centuryCheck = 6;
                break;
            case 21:
                centuryCheck = 4;
                break;
        }

        yearLastTwoDigits = yearLastTwoDigits + centuryCheck;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if ((month == 1 || month == 2) && isLeapYear) {
            yearLastTwoDigits -= 1;
        }

        int daysOfWeekIndex = yearLastTwoDigits % 7;
        if (daysOfWeekIndex < 0){
            daysOfWeekIndex += 7;
        }

        String[] daysOfWeek = {"Samstag", "Sonntag"}
    }

    public static void main(String[] args) {



        System.out.println(wochentagBerechnen("12.06.2005"));

    }
}