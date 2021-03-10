package day0310;

import java.util.Random;
import java.util.Scanner;

public class LottoGame05 {
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] lottoNumbers = new int[SIZE];
        int[] userNumbers = new int[SIZE];
        int count = 0;
        int userChoice = 0;
        // 반복문
        // 컴퓨터가 숫자 6개 뽑기 []
        // 사용자가 숫지 6개 뽑기 []

        int idx = 0;
        while (idx < lottoNumbers.length) {

            System.out.printf("%d번 숫자\n", idx + 1);
            System.out.print("> ");
            userChoice = sc.nextInt();

            while (!(userChoice >= NUMBER_MIN && userChoice <= NUMBER_MAX)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println();
                System.out.println("숫자를 입력해주세요.");
                System.out.print("> ");
                userChoice = sc.nextInt();
            }

            for (int i = 0; i < lottoNumbers.length; i++) {
                if (userChoice == userNumbers[i]) {

                    break;
                }
            }

            userNumbers[idx] = userChoice;
            idx++;

            for (int i = 0; i < lottoNumbers.length; i++) {

                
                System.out.println("사용자가 뽑은 숫자: " + userChoice);
            }

            lottoNumbers[idx] = random.nextInt(NUMBER_MAX) + 1;
            System.out.println("컴퓨터가 뽑은 숫자: " + lottoNumbers[idx]);
            idx++;
        }
        // 비교
        // 컴퓨터가 뽑은 숫자와 내가뽑은 숫자가 몇개나 일치하는지
        // 일치 개수를 담을 변수 int count

        // 조건
        // same 갯수에 따라 등수를 저장

        // 출력

    }
}
