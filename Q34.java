import java.util.Arrays;
class Q34 {
    public static int[] solution(int[] answers) {
        // 1, 2, 3, 4, 5                   5개
        // 2, 1, 2, 3, 2, 4, 2, 5          8개
        // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5    10개
        int[] supo1 = new int[]{1, 2, 3, 4, 5};
        int[] supo2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] o = new int[]{0, 0, 0};
        int answer_length = answers.length;
        for (int i = 0; i < answer_length; i++) {
            if (answers[i] == supo1[i%5]) {
                o[0]++;
            }
            if (answers[i] == supo2[i%8]) {
                o[1]++;
            }
            if (answers[i] == supo3[i%10]) {
                o[2]++;
            }
        }
        int max = o[0];
        int count = 0;
        for (int i = 0; i < o.length; i++) {
            if (max <= o[i]) {
                if (max == o[i]) {
                    count++;
                }
                max = o[i];
            }
        }
        System.out.println(max);
        System.out.println(count);
        System.out.println(Arrays.toString(o));

        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < o.length; i++) {
            if (max == o[i]) {
                answer[count] = i+1;
                count++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{
                3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
                3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
                3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
                3, 3, 1, 1, 2, 2, 4, 4, 5, 5})));
    }
}
