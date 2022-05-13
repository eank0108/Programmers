class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            // System.out.print();
            
            
            // if(signs[i]) {
            //     answer += absolutes[i];
            // }else{
            //     answer -= absolutes[i];
            // }
            
            answer += (signs[i]? 1:-1) * absolutes[i];
            System.out.print("signs[i]   ");
            System.out.print(signs[i]? 1:-1);
            System.out.print("   absolutes[i]   ");
            System.out.print(absolutes[i]);
            System.out.print("   answer   ");
            System.out.println(answer);
            System.out.print("   *   ");
            System.out.println();
        }
        
        return answer;
    }
}
