import java.util.*;
class Q47 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPN(i)) answer++;
        }
        return answer;
    }

    public static boolean isPN(int n) {
        // n이 소수인지 판별, n>2
        if (n <= 2) {
            return true;
        }
        if (Math.sqrt(n) % 1 == 0) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
//        System.out.println(isPN(19));
        System.out.println(solution(10));
    }
}
