import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] leapYearMonthNumbers = new int[]{6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] nonLeapYearMonthNumbers = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static String[] calenderDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 0 && day <= daysInMonths[month - 1] + 1) {
                    return true;
                }
                return false;
            }
            if (day > 0 && day <= daysInMonths[month - 1]) {
                return true;
            }
            return false;
        }
        if (day > 0 && day <= daysInMonths[month - 1]) {
            return true;
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int daysOfWeek = -1;

        if (isValidDate(year, month, day)) {
            // 1. Based on the first two digit of the year, get the number from the "century" table.
            int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

            // 2. Add to the last two digit of the year.
            int lastTwoDigitsOfYear = year % 100;

            // 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
            int magicYearNumber = lastTwoDigitsOfYear / 4;

            // 4. Add to the number obtained from the month table.
            int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

            // 5. Add to the day.
            int magicDayNumber = day;

            // 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
            daysOfWeek = (magicCenturyNumber + lastTwoDigitsOfYear
                    + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
        }
        return daysOfWeek;
    }

    public static String printDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return null;
        }
        String months = strMonths[month - 1];
        int dayNumber = getDayOfWeek(year, month, day);
        String dayOfWeek = calenderDays[dayNumber];
        return '"' + dayOfWeek + " " + day + " " + months + " " + year + '"';
    }

    public static void printJavaCalender(int year, int month, int day) {
        Calendar can = new GregorianCalendar(year, month - 1, day);
        int dayNumber = can.get(Calendar.DAY_OF_WEEK);
        System.out.println("It is " + calenderDays[dayNumber - 1]);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1990));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(printDate(2012, 2, 14));
        printJavaCalender(2012, 2, 14);
    }
}
