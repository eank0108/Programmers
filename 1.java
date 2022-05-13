import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        String str;
        for(int i = 0; i < b; i++){
            str = "";
            for(int j = 0; j < a; j++){
                str += "*";
            }
            System.out.println(str);
        }
    }
}
