public class Sort {
    public static void bubbleSort(int[] arr) {
        //버블정렬
        final int length = arr.length;
        for (int i = 0; i < length; i++) {	// 배열의 길이만큼 도는데
            for (int j = 0; j < length - i; j++) {	// 0 ~ size -1까지
                if (j + 1 < length && arr[j] > arr[j + 1]) {	// 인접한 애들끼리 계속 비교하면서 자리교체
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
            // 과정 출력
            System.out.print(i+"번쨰 과정 ");
            for(int x : arr)
                System.out.print(x+" ");
            System.out.println();
        }
    }
    public static void selectionSort(int[] arr) {
        //선택정렬
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // 나보다 작은게 있으면 치환
            if (min != i) {
                arr[min] = arr[min] + arr[i];
                arr[i] = arr[min] - arr[i];
                arr[min] = arr[min] - arr[i];
            }
            // 과정 출력
            System.out.print((i+1)+"번쨰 과정  : ");
            for(int x : arr)
                System.out.print(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,54,99,3,2,1,0};
//        bubbleSort(arr);
        selectionSort(arr);
        for(int i : arr)
            System.out.print(i+" ");
    }
}