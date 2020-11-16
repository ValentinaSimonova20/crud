package com.internship.kiss;

public class WeekDay {

    // сложная реализация
    public String weekDay(int day){
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new RuntimeException("day must be in range 1 to 7");
        }
    }

    // простая реализация
    public String weekDay2(int day){
        if ((day < 1) || (day > 7)) throw new RuntimeException("day must be in range 1 to 7");
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        return days[day - 1];
    }
}
