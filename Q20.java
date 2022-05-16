import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

class Q20 {
    public static String solution(String[] participant, String[] completion) {
/////////////////////////////////////////////////////////////////////////////////////////
//        String answer = "";
//        LinkedList<String> c = new LinkedList<>(Arrays.asList(completion));
//        LinkedList<String> p = new LinkedList<>(Arrays.asList(participant));
//        c.sort(Comparator.naturalOrder());
//        p.sort(Comparator.naturalOrder());
////        Collections.sort(c);
////        Collections.sort(p);
//
//        for(int i=0; i<c.size();i++){
//            if(! c.get(i).equals(p.get(i)) ){
//                answer = p.get(i);
//                break;
//            }
//        }
//        if(answer == ""){
//            answer = p.get(p.size()-1);
//        }
//
//
//        // for(String cc : c){
//        //     if(p.contains(cc)){
//        //         p.remove(cc);
//        //     }
//        // }
//        return answer;
//////////////////////////////////////////////////////////////////////////////////
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }

        return participant[i];
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}
