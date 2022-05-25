import java.util.*;
class Q32 {
    public static int solution(int n) {
        int answer = 0;
        long n3 = 0;
        int ten = 0;
        while (n > 0) {
            n3 += (n % 3) * ((long) Math.pow(10, ten));
            n = n / 3;
            ten++;
        }
        String s = String.valueOf(n3);
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            answer += (s.charAt(i)-'0') * Math.pow(3, i);
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(27));
//        System.out.println(change(10,3,92475234));
    }
}
