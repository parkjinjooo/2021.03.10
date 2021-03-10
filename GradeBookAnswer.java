package day0310;

import java.util.Scanner;

public class GradeBookAnswer {
    static final int STUDENT_SIZE = 5;
    static final int SUBJECT_SIZE = 3; // 평균 구해주기 위해
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정보를 담을 배열들을 만들어준다.

        // 번호를 담을 ideArray
        int[] idArray = new int[STUDENT_SIZE];
        // 이름을 담을 nameArray
        String[] nameArray = new String[STUDENT_SIZE];
        // 국어 점수를 담을 koreanArray
        int[] koreanArray = new int[STUDENT_SIZE];
        // 영어 점수를 담을 englishArray
        int[] englishArray = new int[STUDENT_SIZE];
        // 수학 점수를 담을 mathArray
        int[] mathArray = new int[STUDENT_SIZE];

        // 지금 현재 입력할 인덱스를 저장한 int idx
        int idx = 0;

        while (true) {
            System.out.println();
            System.out.println("1. 입력  2. 출력  3. 종료");
            System.out.print("> ");
            int userChoice = sc.nextInt();
            if (userChoice == 1) {
                // idx 칸에 각 정보를 입력한다.

                // 먼저 우리가 5명 미만을 입력했을 경우
                // idx칸에 입력한다.

                // 만약 우리가 5명을 입력했으면 더이상
                // 입력이 안되게 막는다.

                if (idx < STUDENT_SIZE) {
                    // 아직 5명 미만이 입력됬으므로
                    // 입력 가능

                    // 번호 입력
                    System.out.println("번호");
                    System.out.println("> ");
                    idArray[idx] = sc.nextInt();

                    // 이름 입력
                    sc.nextLine();
                    System.out.println("이름");
                    System.out.print("> ");
                    nameArray[idx] = new String(sc.nextLine());
                    
                    // 국어 입력
                    System.out.println("국어");
                    System.out.print("> ");
                    koreanArray[idx] = sc.nextInt();

                    // 국어 입력 검증
                    while(!(koreanArray[idx] >=SCORE_MIN && koreanArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("국어");
                        System.out.print("> ");
                        koreanArray[idx] = sc.nextInt();

                    }

                    // 영어 입력
                    System.out.println("영어");
                    System.out.print("> ");
                    englishArray[idx] = sc.nextInt();

                    // 영어 입력 검증
                    while(!(englishArray[idx] >=SCORE_MIN && englishArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("영어");
                        System.out.print("> ");
                        englishArray[idx] = sc.nextInt();
                    }
                    

                    // 수학 입력
                        System.out.println("수학");
                        System.out.print("> ");
                        mathArray[idx] = sc.nextInt();

                    // 수학 입력 검증
                        while(!(mathArray[idx] >=SCORE_MIN && mathArray[idx] <= SCORE_MAX)) {
                            System.out.println("잘못 입력하셨습니다.");
                            System.out.println("영어");
                            System.out.print("> ");
                            mathArray[idx] = sc.nextInt();
                        }
                        

                    // IDX값 증가
                        idx++;
                        
                }else {
                    // 이미 우리가 5명을 다 입력했으므로 
                    // 더이상 입력할 수 없다만 알려준다. 
                    System.out.println("더이상 입력하실 수 없습니다. ");
                }

            } else if (userChoice == 2) {
                // 배열의 내용을 출력한다.
                if (idx > 0) {
                    // idx 가 0보다 크다라는 것은
                    // 현재 입력한 인덱스가 0보다 크다.
                    // 즉 1명 이상이 입력되어있다라는 뜻이 된다.

                    // 그럴 경우엔 0번 idx부터 idx 보다 작을때까지 i for 문을 사용하여
                    // 내용을 출력해주면 된다.

                    for (int i = 0; i < idx; i++) {
                        System.out.println();
                        System.out.println("======" + nameArray[i] + "학생의 정보========");
                        System.out.printf("번호: %d번 이름:%s \n", idArray[i], nameArray[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점\n", koreanArray[i], englishArray[i],
                                mathArray[i]);

                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                        double average = (double) sum / SUBJECT_SIZE;

                        System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
                        System.out.println("=================================");
                        System.out.println();

                    }
                } else {

                    System.out.println();
                    System.out.println("아직 입력된 학생이 존재하지 않습니다.");
                    System.out.println();
                }

            } else if (userChoice == 3) {
                // 메시지 출력후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        sc.close();

    }
}
