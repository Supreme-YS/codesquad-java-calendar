package supreme.calendar;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month;
        int year;

        while (true) {
            System.out.println("연도를 입력하세요");
            System.out.print(PROMPT);
            year = scanner.nextInt();
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            month = scanner.nextInt();

            if (month <= 0) {
                break;
            } else if (month > 12) {
                System.out.println("1부터 12사이의 숫자를 입력하세요");
                continue;
            }
            cal.printCalendar(year, month);
        }

        System.out.println("프로그램 종료 :D");
        scanner.close();
    }

    public static void main(String[] args) {
        // 셀 실행
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
