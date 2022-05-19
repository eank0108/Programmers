import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Q45 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
        ArrayList<Integer> arr2 = new ArrayList<>();
        int i = 0;
        for (int[] command : commands) {
//            System.out.println(arr.subList(commands[i][0]-1, commands[i][1]));
            arr2 = new ArrayList<Integer>(arr.subList(command[0]-1, command[1]));
            arr2.sort(Comparator.naturalOrder());
            answer[i] = arr2.get(command[2]-1);
            i++;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
