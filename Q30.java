class Q31 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] wallet = {0,0};
        for(int i = 0; i < sizes.length; i ++){
            int[] size = sizes[i];
            int maxWH = Math.max(size[0],size[1]);
            int minWH = Math.min(size[0],size[1]);
            wallet[0] = Math.max(wallet[0],maxWH);
            wallet[1] = Math.max(wallet[1],minWH);

        }
        return wallet[0] * wallet[1];
    }
}