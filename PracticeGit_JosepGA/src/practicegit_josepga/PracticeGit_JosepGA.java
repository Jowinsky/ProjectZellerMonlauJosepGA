package practicegit_josepga;

/*
18/02/2021
author: Josep Garcia Aceñero
Día internacional del programador
*/

public class PracticeGit_JosepGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day = 13, month = 9, year = 2021;
        String weekday = birthdayWeekday(day, month, year);
        System.out.println(weekday);
    }

    private static String birthdayWeekday(int day, int month, int year) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return weekdays[d];
    }

}