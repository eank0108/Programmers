import java.util.*;
class Q42888 {
    public static String[] solution(String[] records) {
        int answerLength = records.length;
        String[] record = new String[3];
        for (int i = records.length - 1; i >= 0; i--) {
            record = records[i].split(" ");
            if (record[0].equals("Change")) {
                records[i] = "";
                answerLength--;
                for (int j = i - 1; j >= 0; j--) {
                    if (records[j].contains("Change " + record[0] + " ")) {
                        records[j] = "";
                        answerLength--;
                        continue;
                    }
                    if (records[j].contains("Change")) {
                        continue;
                    }
                    if (records[j].contains(record[1] + " ")) {
                        if (records[j].contains("Enter")) {
                            records[j] = record[2] + "님이 들어왔습니다.";
                        }else{
                            records[j] = record[2] + "님이 나갔습니다.";
                        }
                    }
                }
            }

        }
        System.out.println(Arrays.toString(records));
        String[] answer = new String[answerLength];
        int answeri=0;
        for (int i = 0; i < records.length; i++) {
            if (records[i].equals("")){ continue;}

            record = records[i].split(" ");

            if (record[0].equals("Enter")){
                answer[answeri] = record[2] + "님이 들어왔습니다.";
            }else if(record[0].equals("Leave")){
                answer[answeri] = record[2] + "님이 나갔습니다.";
            }
            answeri++;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})));
    }
}
