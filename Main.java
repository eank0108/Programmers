import java.util.Arrays;

public class Main {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        // answer 배열을 초기화, arr1, arr2, signs 배열의 각 크기는 다를 수가 없음
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                // signs 의 해당 인덱스 를 찾아서 true 1, false 면 -1
                int sign = signs[i][j] ? 1 : -1;

                //arr1,arr2 의 해당 인덱스 값들의 합에 부호 sign을 곱해줌
                answer[i][j] = (arr1[i][j] + arr2[i][j]) * sign;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
//        int[][] arr1 = {{1,2},{2,3}};
//        int[][] arr2 = {{3,4},{5,6}};
//        boolean[][] signs={{true,true},{true,false}};
        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        boolean[][] signs={{false},{false}};
//        int[][] arr1 = {{5,7,1},{2,3,5}};
//        int[][] arr2 = {{5,1,6},{7,5,6}};
//        boolean[][] signs={{true,true,false},{false,true,false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}