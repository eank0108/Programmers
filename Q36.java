import java.util.*;
class Q36 {
    public static String solution(String s) {
        char[] arr =s.toCharArray();
//        Integer[] arr2 = Arrays.stream(array).boxed().toArray(Integer[] :: new);
//        Arrays.sort(arr, Collections.reverseOrder()); // 에러, Character 형식이 필요함
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(String.valueOf(arr));


        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("Zbacdefg"));
    }
}
