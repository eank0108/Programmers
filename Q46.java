import java.util.*;
class Q46 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(0));
    }
}
