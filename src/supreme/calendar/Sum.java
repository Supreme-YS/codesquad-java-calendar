package supreme.calendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // 입력 : 키보드로 두 수를 입력받는다.
        // 출력 : 화면에 두 수의 합을 구한다.

        int a, b;
        Scanner scanner = new Scanner(System.in); // System.in은 키보드 입력을 받게 해줌
        String s1, s2;
        System.out.println("두 수를 입력하세요");
        s1 = scanner.next(); // scanner.next는 String 변수에 넣어줄 수 있기 때문에 바로 a나 b 변수에 넣을 수 없음
        s2 = scanner.next();
//        System.out.println(s1 + ", " + s2);

        // 형 변환해서 a, b에 넣어보기
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        int c = a + b;
        System.out.println(a + ", " + b);
        System.out.println("두 수의 합은 " + c + "입니다.");
        }
}
