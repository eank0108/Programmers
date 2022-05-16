import java.util.*;
class Q41 {
    public static int solution(int left, int right) {
        int answer = 0;
        int divCount = 0;
        for (int i = left; i <= right; i++) {
            divCount = getDivCount(i);
            answer += (divCount % 2 == 0 ? 1 : -1) * i;
            System.out.println(answer);
        }
        return answer;
    }

    public static int getDivCount(int num) {
        int answer = 0;
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                answer+=2;
            }
            if (i == Math.sqrt(num)) {
                answer--;
            }
        }
        System.out.println("num " +num +", answer " + answer);
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
    public static ArrayList<Integer> select3(ArrayList<Integer> arr,int n){
        ArrayList<Integer> retArr = new ArrayList<>();
        ArrayList<Integer> tempArr = new ArrayList<>();
        tempArr = new ArrayList<>(arr);
        tempArr.remove(3);
        System.out.println("arr = " + arr);
        System.out.println("tempArr = " + tempArr);
        tempArr.remove(3);
        System.out.println("arr = " + arr);
        System.out.println("tempArr = " + tempArr);
        return retArr;
    }
    public static ArrayList<Integer> select2(ArrayList<Integer> arr,int n){
        // [2,2,2,3,5] 중 2개 뽑는 함수
        // 배열에서 n 개를 뽑아서 곱한 값을 중복 없이 배열에 담아 리턴하는 함수

        if (n == 1) {
            return arr;
        }
        int ret = 1;
        ArrayList<Integer> retArr = new ArrayList<>();
        ArrayList<Integer> tempArr;
        for (int i = 0; i < arr.size(); i++) {
            ret = 1;
            tempArr = new ArrayList<>(arr);

            ret = ret * arr.get(i);
            tempArr.remove(i);
            ArrayList<Integer> ret_select2 = select2(tempArr, n-1);

            for (int j = 0; j < ret_select2.size(); j++) {
                retArr.add(ret * ret_select2.get(j));
            }
        }
        HashSet<Integer> dup = new HashSet<>(retArr);
        retArr = new ArrayList<Integer>(dup);
        return retArr;

    }
    public static int factorial(int n) {
//        1~n까지 곱하는 함수
        if (n == 1) {
            return 1;
        }
        int ret = n;

        ret = ret * factorial(n - 1);
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(solution(13,17));
//        System.out.println(factorial(3));
//        System.out.println(select2(new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2,2,3,5)),5));
    }
}
