
public class Main {
    public static void func(){

        int[] array = new int[]{0,2,3,6,1,7,8,9,4,5};
        int temp; // 배열의 값을 변경하기 위한 임시값
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // i번째 값이 j 번째 값보다 크다면 위치를 변경해줌
                    temp = array[i];
                    array[i] = j;
                    array[j] = temp;
                }
            }
        }
    }
    // N 의 크기를 갖는 배열을 정렬해야 할 경우 N+(N-1)+(N-2)... 3+2+1 즉 N(N+1)/2 ,N^2에 비례함, 시간복잡도 N^2
    public static void main(String[] args) {

    }
}
