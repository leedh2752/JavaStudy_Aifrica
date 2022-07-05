package ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {
    static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        while (true) {
            switch (displayMenu()) {
                case 1:
                    inputRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        } // while(true)
    }

    // menu를 보여주는 메서드
    static int displayMenu() {
        System.out.println("**************************************************");
        System.out.println("*        성적 관리 프로그램        *");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println(" 1. 학생성적 입력하기");
        System.out.println();
        System.out.println(" 2. 학생성적 보기");
        System.out.println();
        System.out.println(" 3. 프로그램 종료");
        System.out.println();
        System.out.print(" .(1~3) : 원하는 메뉴를 선택하세요");
        System.out.println();
        int menu = 0;
        String get;
        while (true) {
            ///////////////////////////////////////////
            get = s.nextLine();
            try {
                menu = Integer.parseInt(get);
                if (menu < 1 || menu > 3) {
                    System.out.printf("%s - 입력값이 잘못되었습니다. 다시 입력해주세요.", get);
                    System.out.println();
//                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s - 입력값이 잘못되었습니다. 다시 입력해주세요.", get);
                System.out.println();
            }
        }
        return menu;
    }

    static void inputRecord() {
        System.out.println("1. 학생성적 입력하기");
        System.out.println("이름, 반, 번호, 국어성적, 영어성적, 수학성적의 순서로 공백없이 입력하세요.");
        System.out.println("입력을 마치려면 p를 입력하세요. 메인화면으로 돌아갑니다.");
        while (true) {
            System.out.print(">>");
            /////////////////////////////////////////
            try {
                String input = s.nextLine().trim();
                if (!input.equalsIgnoreCase("q")) {
// Scanner .(',' ) 를 이용해서 화면으로 부터 데이터를 입력받는다 를 구분자로
                    Scanner s2 = new Scanner(input).useDelimiter(",");
// Student record . 입력받은 값으로 인스턴스를 생성하고 에 추가한다
                    record.add(new Student(s2.next(), s2.nextInt(), s2.nextInt(),
                            s2.nextInt(), s2.nextInt(), s2.nextInt()));
                    System.out.println("잘입력되었습니다. 입력을 마치려면 p를 입력하세요.");
                } else {
// q Q . 입력받은 값이 또는 이면 메서드를 종료한다
                    return;
                }
            } catch (Exception e) {
// , " ." . 입력받은 데이터에서 예외가 발생하면 입력오류입니다 를 보여주고 다시 입력받는다
                System.out.println("입력오류입니다. 이름, 반, 번호, 국어성적,영어성적, 수학성적의 순서로 입력하세요");
            } // end of while
        }
    }

    static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();
        if (length > 0) {
            System.out.println();
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
            System.out.println("====================================================");
            for (int i = 0; i < length; i++) {
                Student student = (Student) record.get(i);
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }
            System.out.println("====================================================");
            System.out.println("총점 : " + koreanTotal + " " + englishTotal
                    + " " + mathTotal + " " + total);
            System.out.println();
        } else {
            System.out.println("====================================================");
            System.out.println("데이터가 없습니다.");
            System.out.println("====================================================");
        }
    } // static void displayRecord() {
}
