import java.util.ArrayList;
import java.util.Arrays;

class Car{
    int gas; // 주유량
    static private ArrayList<String> busNumberArray  = new ArrayList<>();
    //오류 로그 - private ArrayList<String> busNumberArray; 라고선언해서 finished with non-zero exit value 1 java error 오류 난듯?? 왜????? private ArrayList<String> busNumberArray  = new ArrayList<>(); 선언하니 없어짐.
    // static(정적변수) 선언을 하면 메모리에 저장됨. 메모리 할당을 딱 한번만 하기 때문에 같은 곳의 메모리 주소만을 바라봄, 공유 개념, 리스트 개념이라서( 첫번째 노드에서 다음 노드를 가르키기 때문에 수정, 삭제가 가능한지?? 배열( ex.String[]) 이면 불가능할지?

    static boolean addBusNum(String busNumber) {
//        System.out.println(busNumberArray.contains(busNumber));
        if (busNumberArray.contains(busNumber)) {
            return false;
        }
        busNumberArray.add(busNumber);
        return true;
    }

}
class Bus extends Car{
    int maxPassenger;  // 최대 승객수
    int currentPassenger;  // 현재 승객수
    int price; // 요금
    final String busNumber;  // 버스 번호, 요구사항
    int speed; // 현재 속도
    String state; // "운행", "차고지 행"

    public Bus(String busNumber) {
        this.busNumber = busNumber;
//        System.out.println(addBusNum(busNumber));
        if(!addBusNum(busNumber)){
            System.out.println("이미 있는 버스번호 입니다.");
        }else{
            System.out.println("추가 완료");
        }
        this.state = "운행"; // 요구사항 - 버스 객체 생성시 최초 상태는 ‘운행’ 상태가 됨
    }
}
//UUID
//키에 버스번호 value에 객체 (map)

public class Assignment {
    public static void main(String[] args) {
        Bus bus1 = new Bus("31");
        Bus bus2 = new Bus("31");
        // 같은 번호의 버스를 생성시키면 삭제를 어떻게 해야 할지?? 입력받을때 객체 생성 안하면 되긴 하는데 궁금함. bus2=null 하면 되는건지?? 가비지에 들어간다는데 더 좋은 방법은 없는지??
        System.out.println(bus1.state);
        System.out.println(bus2.state);
        System.out.println(Car.addBusNum("31"));
////        https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=allkanet72&logNo=220900789195
//        입력값 계속 받기
        return;
    }
}
