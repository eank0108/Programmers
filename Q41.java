import java.util.*;
class Q41 {
    public static int solution(int left, int right) {
        int answer = 0;
        getDiv(120);
        return answer;
    }

    public static int getDiv(int dividor) {
        int ret =0;
        /*
        * 120 이면
        * [1,2,2,2,3,5]
        * 1*2*2*2*3*5
        * 2개선택
        * 1,2,3,5,4,6,10,15
        * 3개선택
        * 8,12,20,30
        * 4개선택
        * 24,40,60
        * 5개선택
        * 120
        * [1,1,1,1,1,2,2,2,3,5]
        * 5개선택
        *
        *
        *
        *
        * 20이면
        * 2 * 10
        * 2 * ( 2 * 5 )

        *
        * 2,4,8
        * 3
        * 5
        *    2
            60
            2
            30
            2
            15
            3
            5
            * 재귀함수
            * 약수의 개수가 2개면 끝
            * while 약수의 개수가 2개일때 까지
            * 2
            *
        * */
        ArrayList<Integer> divs = new ArrayList<>();
        ArrayList<Integer> retArr = new ArrayList<>();
        int div = dividor;
        //마지막 소인수를 구하기 위한 임시 값
        int temp = 1;
        loop:
        while (div != 1) {
            for (int i = 2; i < div; i++) {

                if (i == div-1 && temp * div == dividor){
                    // 마지막 소인수일때
                    divs.add(div);
                    break loop;
                }
                if (div % i == 0) {
                    divs.add(i);
                    div = div / i;
                    temp = temp * i;
                    break;
                }
            }
        }
        // dividor = 120,  divs = [2,2,2,3,5]
        // divs 안에서 5개를 뽑아 곱한 값이 약수의 갯수
        for (int i = 1; i <= divs.size(); i++) {
            // i개를 뽑아서 곱함
            // retArr.add(divs.get(i));
            for (int j = 0; j < divs.size(); j++) {

            }
        }

        System.out.println(divs);
        return ret;
    }
    public static ArrayList<Integer> select2(ArrayList<Integer> arr,int n){
        // [2,2,2,3,5] 중 2개 뽑는 함수
        // 배열에서 n 개를 뽑는 함수

        ArrayList<Integer> retArr = new ArrayList<>(Arrays.asList(2,2,2,3,5));

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            retArr.add(arr.get(i));
            if(n == 1){
                return retArr;
            }else{
                retArr=select2(arr,--n);
            }
        }


//
//        for (int i = 0; i < arr.size(); i++) {
//            retArr.add(arr.get(i));
//            arr.remove(i);
//            if(n != 0)
//            retArr = select2(arr, n-1);
//        }
        return retArr;

    }

    public static void main(String[] args) {
//        System.out.println(solution(3,4));
        System.out.println(select2(new ArrayList<>(Arrays.asList(2,2,2,3,5)),3));
    }
}
