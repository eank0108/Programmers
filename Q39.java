import java.util.*;
class Q39 {
    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(s);
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i)==32) continue;
            int ascii = answer.charAt(i)+n;
            if (ascii > 90 && answer.charAt(i) <= 90) {
                //대문자
                ascii -= 26;
            }
            if (ascii > 122 && answer.charAt(i) >= 97) {
                //소문자
                ascii-=26;
            }
            answer.setCharAt(i, (char) ascii);

        }
        return answer.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("a B z",4));
    }
}
