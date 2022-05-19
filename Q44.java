import java.util.ArrayList;
import java.util.Arrays;
class Q44 {
    public static long[] solution(int n, int m) {
        long[] answer = new long[]{1,1};
        long getI;
        long getJ;
//        System.out.println(Func.factorization(n));
//        System.out.println(Func.factorization(m));
        ArrayList<Integer> nArr = Func.factorization(n);
        ArrayList<Integer> mArr = Func.factorization(m);
        // 교집합이 최대공약수, 합집합이 최소공배수
        // [2,2,3,7], [2,5,7]
        for (int i = 0; i < nArr.size(); i++) {
//            System.out.println("for i = " + i);
//            System.out.println(Arrays.toString(answer));
//            System.out.println(nArr);
            getI = nArr.get(i);
            for (int j = 0; j < mArr.size(); j++) {
//                System.out.println(mArr);
//                System.out.println("for j = " + j);
                getJ = mArr.get(j);
                if (getI ==getJ) {
                    answer[0] = answer[0] * getI;
                    System.out.println("answer0="+answer[0]+" , getI = " + getI);
                    nArr.remove(i);
                    i--;
                    mArr.remove(j);
                    j--;
                    continue;
                }
                if (i == nArr.size() - 1) {
                    System.out.println("answer1="+answer[1]+" , getJ = " + getJ);
                    answer[1] = answer[1] * getJ;
                }
            }
            answer[1] = answer[1] * getI;
            System.out.println("answer1="+answer[1]+" , getI = " + getI);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(14, 9)));
//        System.out.println(Func.factorization(13));
    }
}

class Func {
    public static ArrayList<Integer> factorization(int n){
        //약수들의 집합 반환 소수일땐 1 빼고 자기 자신 반환
        ArrayList<Integer> retArr = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                retArr.add(i);
                retArr.addAll(factorization(n / i));
                break;
            }
        }
        if (retArr.size() == 0) {
            retArr.add(n);
        }
        return retArr;
    }
}
// 20, 12 => [4,60]
// [2,2,5]
// [2,2,3]
// [2,2,3,5]

// 26, 52
// [2,13]
// [2,2,13]

// 420, 117
// [2,2,3,5,7]
// [3,3,13]
// [2,2,3,3,5,7,13]
