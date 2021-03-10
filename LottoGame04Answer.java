package day0310;

import java.util.Scanner;

public class LottoGame04Answer {
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자가 입력한 숫자를 보관할 배열
        int[] lottoNumbers = new int[SIZE];

        // 몇번 인덱스에 입력할 차레인지를 저장한 int idx;
        int idx = 0;

        // idx가 lottoNumbers.length 보다 작을 동안
        // while() 을 이용해서, lottoNumbers[idx]에 사용자가 입력한 값을 하나씩 입력한다.
        while (idx < lottoNumbers.length) {
            System.out.printf("%d번 숫자\n", idx + 1);
            System.out.print("> ");
            int userNumber = sc.nextInt();

            // 사용자가 입력한 값이 (NUMBER_MIN 이상 && NUMBER_MAX 이하)가 아닐 경우
            // 반복이 되게 while 문을 작성해준다.
            while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.printf("%d번 숫자\n", idx + 1);
                System.out.print("> ");
                userNumber = sc.nextInt();
            }

            // 사용자가 입력한 숫자가 중복인지 아닌지를 체크한다.

            // 사용자가 입력한 숫자가 중복이 아니면 true 이고, 중복이면 false가 저장되는 numberChecker
            boolean numberChecker = true;

            // for 문을 사용해서, 만약 사용자가 입력한 숫자가 배열에 존재할 시에는
            // numberChecker를 false로 바꾸고 break해준다.

            for (int i = 0; i < lottoNumbers.length; i++) {
                if (userNumber == lottoNumbers[i]) {
                    numberChecker = false;
                    break;
                }
            }
            // numberChecker에 저장된 값이
            // true이면, 현재 배열에 idx번 칸에 userNumber로 할당해주고 idx++해준다.
            // flase이면, 이미 중복된 숫자입니다. 라는 메시지만 출력해준다.

            if (numberChecker) {
                lottoNumbers[idx] = userNumber;
                idx++;
            } else {
                System.out.println("중복된 번호입니다.");
            }

        }

        // 정렬해주는 for문

        // 우리가 lottoNumbers의 i 번째와 i+1번째를 비교해야하므로
        // 이 for문의 반복 조건식을 i가 lottoNumbers의 크기보다 1 작을 동안으로 해야
        // 4번째와 5번째를 비교하고 for문이 종료되서 혹시라도 존재하지 않는 6번째 인덱스에
        // 접근이 안되게 된다.
        for (int i = 0; i < lottoNumbers.length - 1; i++) {

            // lottoNubers의 i번째에 할당된 값이 i+1번째보다 크다는건
            // 큰 숫자가 앞에 나와있다는 의미 이므로, 2개의 순서를 바꿔준다.
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {

                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = temp;

                // 위의 코드가 끝나고 나서
                // i는 -1로 할당하는 코드까지 실행하면
                // 그 다음에 실행되는 코드는 무조건 i++이기 때문에
                // 다시 배열의 제일 앞부터 정렬이 되어있는지 검사하고 정렬할 수가 있게 된다.

                i = -1;

            }
        }
        // 사용자가 입력한 숫자들을 출력해준다.
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d]: %2d\n", i, lottoNumbers[i]);
        }

        sc.close();
    }
}
