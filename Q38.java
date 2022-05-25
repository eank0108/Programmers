import java.util.*;
class Q38 {
    public static int solution(String s) {
        String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i],i + "");
            //https://coding-factory.tistory.com/128
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
