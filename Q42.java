import java.util.*;
class Q42 {
    public static int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);
        System.out.println(sqrt);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                answer += i;
                answer += n / i;
            }
        }
        if (sqrt * sqrt == n) {
            answer -= sqrt;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
