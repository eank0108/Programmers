import java.util.*;
class Q31 {
    public static int[] solution(int []arr) {


        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(arr[0]);
        for (int i = 1, temp = arr[0]; i < arr.length; i++) {
//            System.out.println(temp);
            if(arr[i] != temp){
                arrl.add(arr[i]);
                temp = arr[i];
            }
        }
        int[] answer = new int[arrl.size()];
        for (int i = 0; i < arrl.size(); i++) {
            answer[i] = arrl.get(i);
        }
        return answer;


    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,3,4}));
    }
}
