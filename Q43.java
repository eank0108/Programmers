import java.util.ArrayList;
import java.util.Arrays;
class Q43 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int total = Arrays.stream(d).sum();
        Arrays.sort(d);
        int i;
        if (total <= budget) {
            return d.length;
        }
        for (i = 0; i < d.length; i++) {
            total -= d[d.length-i-1];
            if (total <= budget) {
                return d.length-i-1;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4},9));
    }
}
