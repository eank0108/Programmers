import java.util.*;
class Q48 {
    public static int[] solution(int N, int[] stages) {
//        int[] answer = new int[N];
//        double[] failRate = new double[N];
//        int temp1 = 0; // 도전했지만 클리어 못한사람
//        int temp2 = 0; // 도전하고 클리어 한사람
//        for (int i = 1; i <= N; i++) {
//
//            answer[i-1] = i;
//            temp1=0;
//            temp2=0;
//            for (int j = 0; j < stages.length; j++) {
//                if (stages[j] > i) {
//                    // i 스테이지 도전하고 클리어 한 사람
//                    temp2++;
//                } else if (stages[j] == i) {
//                    // i 스테이지 도전했지만 클리어 못한 사람
//                    temp1++;
//                    temp2++;
//                }
//            }
//            System.out.println(i+" 스테이지 "+temp1+","+temp2+", "+(double)temp1/temp2);
//            if(temp2 == 0) temp2 = 1;
////            failRate.put((double) temp1 / temp2,i);
//            failRate[i-1] = (double)temp1/temp2;
//        }
//        /*  [1,2,3,4]
//            [4,2,3,1]
//
//        */
//        System.out.println(Arrays.toString(failRate));
//        for (int i = 0; i < N; i++) {
//            int max = i;
//
//            for (int j = i + 1; j < N; j++) {
//                if (failRate[j] > failRate[max]) {
//                    max = j;
//                }
//            }
//            // 나보다 작은게 있으면 치환
//            if (max != i) {
//                failRate[max] = failRate[max] + failRate[i];
//                failRate[i] = failRate[max] - failRate[i];
//                failRate[max] = failRate[max] - failRate[i];
//                answer[max] = answer[max] + answer[i];
//                answer[i] = answer[max] - answer[i];
//                answer[max] = answer[max] - answer[i];
//            }
//        }
//
//        return answer;
        int[] answer = new int[N];
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4})));
    }
}
