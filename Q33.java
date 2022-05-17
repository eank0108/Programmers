import java.util.*;
class Q33 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[]{7,1};
        loop:
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                answer[0]--;
                answer[1]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    //일치하는 숫자 있음
                    answer[0]--;
                    continue loop;
                }
            }
            answer[1]++;
        }
        if (answer[1] == 7) {
            answer[1] = 6;
        }
        return answer;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }
}
