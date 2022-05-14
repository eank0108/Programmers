import java.util.ArrayList;
class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> arr = new ArrayList();
        for(int i = 1; i < n+1; i++){
            arr.add((long)x*i);
        }
        
        long[] answer = new long[arr.size()];
        for (int i=0; i < arr.size(); i++){
            answer[i] = arr.get(i).longValue();
            // 컴파일시 arr.get(i) 값이 어떤 타입 인지 몰라서 에러?
            // arr 선언시 자료형을 함께 선언 하니 해결 (ArrayList<Long> arr)
        }
        return answer;
    }
}
