package day0310;
// 2차원 배열 
// 배열 = 똑같은 데이터타입을 모아둔 하나의 데이터타입
// 그렇다면, 배열도 데이터타입이니깐 배열도 모아둘 수 있지 않을까?
// 즉 2차원 배열이란, 어떤 데이터타입의 배열을 모아서 하나의 배열로 다루는 것을 2차원 배열이라고 한다!

// 2차원 배열의 선언과 초기화 
// 데이터타입[][] 배열이름 = new 데이터타입[크기1][크기2];
// 크기1: 2차원 배열의 크기 
// 크기2: 2차원 배열안의 개별 배열의 크기. 단, 크기2는 생략 가능하다. 

public class Ex012DArray {
    public static void main(String[] args) {
        // 2차원 배열을 선언과 초기화해보자
        int[][] doubleArray = new int[2][3];
        // 위의 코드는 구어로 풀어서 말하면
        // "크기가 3인 int 배열이 2개 모여있는 2차원 배열 doubleArray"가 된다.
      
        // doubleArray의 내용을 출력해보자
        System.out.println("doubleArray[0]: "+ doubleArray[0]);
        System.out.println("doubleArray[1]: "+ doubleArray[1]);
        
        // 그러면 doubleArray의 인덱스 0번에 있는 배여르이 인덱스 2번 값을 출력해보자
        System.out.println("doubleArray[0][2]: "+doubleArray[0][2]);
        
      
    }
}
