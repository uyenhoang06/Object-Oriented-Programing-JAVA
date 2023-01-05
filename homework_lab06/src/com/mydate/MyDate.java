package com.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    static final String[] MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static final String[] DAYS = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static final int[] DAYS_IN_MONTHS = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (1 <= year && year <= 9999) {
            if (1 <= month && month <= 12) {
                int maxDay = DAYS_IN_MONTHS[month - 1];
                if (isLeapYear(year)) {
                    if (month == 2) {
                        maxDay = 29;
                    }
                }
                if (1 <= day && day <= maxDay) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }
        int[] firstNumberValue = {6, 4, 2, 0};
        int[] nonLeapYearValue = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearValue = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int firstTwoDigits = year / 100;
        int lastTwoDigits = year % 100;
        int dayOfWeek = firstNumberValue[firstTwoDigits % 4] + lastTwoDigits + lastTwoDigits / 4;
        dayOfWeek += isLeapYear(year) ? leapYearValue[month - 1] : nonLeapYearValue[month - 1];
        dayOfWeek += day;
        return dayOfWeek % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day, month or day!");
        }
    }

    public void setYear(int year) {
        if (1 <= year && year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    public void setMonth(int month) {
        if (1 <= month && month <= 9999) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month");
        }
    }

    public void setDay(int day) {
        if (1 <= year && year <= 9999) {
            if (1 <= month && month <= 12) {
                if (isLeapYear(year)) {
                    DAYS_IN_MONTHS[1] = 29;
                }
                int maxDay = DAYS_IN_MONTHS[month - 1];
                if (1 <= day && day <= maxDay) {
                    this.day = day;
                }
            }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return String.format("%s %02d %s %04d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year)) {
            if (month == 2) {
                maxDay = 29;
            }
        }
        if (day < maxDay) {
            day++;
        } else {
            day = 1;
            month++;
            if (month == 13) {
                month = 1;
                year++;
                if (year > 9999) {
                    throw new IllegalArgumentException("Year out of range!");
                }
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month == 13) {
            month = 1;
            year++;
            if (year > 9999) {
                throw new IllegalArgumentException("Year out of range!");
            }
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year)) {
            if (month == 2) {
                maxDay = 29;
            }
        }
        if (day < maxDay) {
            return this;
        } else {
            day = day - maxDay + 1;
            month++;
            if (month == 13) {
                month = 1;
                year++;
                if (year > 9999) {
                    throw new IllegalArgumentException("Year out of range!");
                }
            }
        }
        return this;
    }

    public MyDate nextYear() {
        if (isLeapYear(year)) {
            if (day == 29 && month == 2) {
                setDay(28);
            }
        }
        year++;
        if (year > 9999) {
            throw new IllegalArgumentException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year)) {
            if (month == 2) {
                maxDay = 29;
            }
        }
        day--;
        if (day == 0) {
            month -= 1;
            if (month == 0) {
                month = 12;
                year -= 1;
                if (year <= 0) {
                    throw new IllegalArgumentException("Year out of range!");
                }
            }
            day = maxDay;
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month == 0) {
            month = 12;
            year--;
            if (year <= 0) {
                throw new IllegalArgumentException("Year out of range!");
            }
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(year)) {
            if (month == 2 && day == 29) {
                day = 28;
            }
        }
        year--;
        if (year <= 0) {
            throw new IllegalArgumentException("Year out of range!");
        }
        return this;
    }
}

