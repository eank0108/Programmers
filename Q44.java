import java.util.*;
class Q44 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        return answer;
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println("n" + n);
//        return factorial(n - 1, n * total);
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
//        System.out.println(solution(3,120));
//        System.out.println(factorial(5));
        System.out.println(Func.factorization(50));
//        int n = 5;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            System.out.println(i);
//        }
    }
}

class Func {
    public static ArrayList<Integer> factorization(int n){

        ArrayList<Integer> retArr = new ArrayList<>();
        System.out.println("n "+n+"----------------------------------"+Math.sqrt(n));
        for (int i = 2; i <= Math.sqrt(n); i++) {
            System.out.println("for i "+i+" sqrt"+Math.sqrt(n));
            System.out.println(" n "+n+",i "+i);
            if (n % i == 0) {
                retArr.add(i);
                System.out.println("allAll n "+n+",i "+i);
                retArr.addAll(factorization(n / i));
            }
            System.out.println(" n "+n+",i "+i);
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
