package day0310;
// 게시판 프로그램 

// 게시글에는 제목, 작성자, 내용의 내용이 있다. 
// 이 프로그램은 총 6개의 게시글을 관리할 수 있다.
// 단, 중복된 제목의 글은 작성할 수 없다. 
// 또한 입력과 출력은 분리되어있다.
// 2시 50분까지 

import java.util.Scanner;

public class Board01 {
    static final int SIZE = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 제목을 담당하는 String매열
        String[] titleArray = new String[SIZE];
        // 작성자를 담당하는 String매열
        String[] userArray = new String[SIZE];
        // 내용을 담당하는 String매열
        String[] contentArray = new String[SIZE];
        // 현재 인덱스를 저장한 int index
        int index = 0;

        while (true) {
            System.out.println("=======게시판 만들기=========");
            System.out.println(" 1. 입력   2. 출력   3. 종료 ");
            System.out.print("> ");
            int userChoice = sc.nextInt();
            if (userChoice == 1) {
                // 글 작성

                // 1. 먼저 우리가 글을 쓸 칸이 남아있는지 체크해서 없을 시에는 경고 메시지만 출력

                if (index < SIZE) {
                    // 글 쓸 칸이 존재하므로 글 쓰는 것을 시작한다.

                    // 2. 제목을 입력받는다.
                    // 단, 제목이 기존 칸에 있는 제목들과 비교해서 만약 이미 있는 제목이면
                    // 중복이 아닐때까지 다시 입력을 받는다.

                    sc.nextLine();
                    System.out.println("제목을 입력하시오.");
                    System.out.print("> ");
                    String title = new String(sc.nextLine());

                    // 중복이면 false, 중복이 아니면 true가 할당되는 boolean 변수 titleChecker
                    boolean titleChecker = true;

                    // 우리가 index 변수의 값이 3이라고 가정한다면, 우리 배열에는 0 1 2 까지만 값이 들어있고,
                    // 3, 4, 5에는 null이다.
                    // 그렇다면, 굳이 3, 4, 5를 체크할 필요가 있을까?

                    for (int i = 0; i < index; i++) {

                        if (title.equals(titleArray[i])) {
                            // 값이 들어가있는 변수를 기준으로 바교!!
                            // titleArray[i].equals(title)은 오류
                            titleChecker = false;
                            break;
                        }
                    }
                    while (!titleChecker) {
                        System.out.println("중복된 제목은 사용하실 수 없습니다.");
                        System.out.println("제목을 입력하시오.");
                        System.out.print("> ");
                        title = new String(sc.nextLine());
                        titleChecker = true;

                        for (int i = 0; i < index; i++) {

                            if (title.equals(titleArray[i])) {
                                // 값이 들어가있는 변수를 기준으로 바교!!
                                // titleArray[i].equals(title)은 오류
                                titleChecker = false;
                                break;
                            }
                        }
                    }
                    titleArray[index] = new String(title);

                    // 3. 작성자를 입력 받는다.

                    System.out.println("작성자을 입력하시오.");
                    System.out.print("> ");
                    userArray[index] = sc.next();

                    // 4. 내용을 입력 받는다.

                    System.out.println("내용을 입력하시오.");
                    System.out.print("> ");
                    contentArray[index] = sc.next();

                    // 5. idx++ 해준다.
                    index++;

                } else {
                    System.out.println("더이상 입력할 수 없습니다.");
                }

            } else if (userChoice == 2) {
                // 글 보기
                if(index > 0) {
                    for(int i = 0 ; i < index ; i ++) {
                        System.out.println();
                        System.out.println("=====================================");
                        System.out.printf("제목: %s,   작성자: %s\n", titleArray[i], userArray[i]);
                        System.out.println("--------------------------------------");
                        System.out.println("                내용                   ");
                        System.out.println("---------------------------------------");
                        System.out.println(contentArray[i]);
                        System.out.println("=======================================");
                        System.out.println();
                    }
                    
                    
                    
                }else {
                    // 작성된 글이 없으므로 경고메시지만 출력 
                    System.out.println("작성된 글이 존재하지 않습니다.");
                }


            } else if (userChoice == 3) {
                // 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }

    }
}
