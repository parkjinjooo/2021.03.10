package day0310;
// 구구단을 int 2차원 배열의 값을 넣고 

// 출력하시오,

// 35분까지
public class Ex022DArray02 {
    public static void main(String[] args) {
        // 구구단은 2단~9단까지
        // 8개의 배열이 모여있는 2차원 배열이다.
        // 그리고 각 배열은 1~9까지 곱한 수가 저장되는 9칸짜리 배열이다.

        int[][] gugudan = new int[8][9];
        System.out.println("gugudan.length: " + gugudan.length);

        // 구구단은 int 배열이 8개 모여있는 배열이므로
        // 크기가 8인 것이다.

        for (int i = 0; i < gugudan.length; i++) {

            // 구구단 = 배열이 모여 있는 배열
            // 구구단 i 번째 엘리먼트 = 배열
            // 그럼 gugudan[i].length 하면 i 번째 엘리먼트인 배열의 크기가 나오게 된다!
            for (int j = 0; j < gugudan[i].length; j++) {
                // gugudan[i][j] 라고 하면
                // gugudan의 i 번째 배열의 j 번째 칸을 가리키게 된다!
                // 그러면 우리가 거기에
                // i * j를 넣어주면?
                // 안된다
                // i: 0~7
                // j: 0~8

                // 그렇기 때문에 해당 칸에 (i+2) * (j+1) 한 결과값을 넣어야 한다!
                gugudan[i][j] = (i + 2) * (j + 1);

            }

        }
        // 출력해보자 
        for(int i =0; i < gugudan.length; i++) {
            System.out.println();
            System.out.println("------------------------------");
            System.out.println((i+2)+"단" );
            for(int j = 0; j < gugudan[i].length; j++) {
                System.out.printf("%d * %d = %2d \n", i+2, j+1, gugudan[i][j]); 
                
                
                
                
                
            }
            System.out.println("------------------------------");
            
            
        }

    }
}
