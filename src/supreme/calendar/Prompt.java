package supreme.calendar;

import java.util.Scanner;

public class Prompt {
    /**
     *
     * @param week 요일명
     * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
     */
    public int parseDay(String week) {
        if (week.equals("SU") ) return 0;
        else if (week.equals("MO")) return 1;
        else if (week.equals("TU")) return 2;
        else if (week.equals("WE")) return 3;
        else if (week.equals("TH")) return 4;
        else if (week.equals("FR")) return 5;
        else if (week.equals("SA")) return 6;
        else
            return 0;
    }

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month;
        int year;
        int weekday;

        while (true) {
            System.out.println("연도를 입력하세요");
            System.out.print("YEAR  > ");
            year = scanner.nextInt();
            System.out.println("달을 입력하세요");
            System.out.print("MONTH > ");
            month = scanner.nextInt();
            System.out.println("첫째날의 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA).");
            String str_weekday = scanner.next();
            weekday = parseDay(str_weekday);

            if (month <= 0) {
                break;
            } else if (month > 12) {
                System.out.println("1부터 12사이의 숫자를 입력하세요");
                continue;
            }
            cal.printCalendar(year, month, weekday);
        }

        System.out.println("프로그램 종료 :D");
        scanner.close();
    }

    public static void main(String[] args) {
        // execute cell
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
