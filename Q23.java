class Q23 {
    public int[] solution(long n) {
        int[] answer = new int[(n+"").length()];
        int i=0;
        while(n>0){
            answer[i] = (int) (n%10);
            System.out.print(n);
            // answer[i] = (int) n%10; => 에러, n을 int로 형변환 먼저 함 ((int) n) % 10
            n=n/10;
            i++;
        }
        return answer;
    }
}