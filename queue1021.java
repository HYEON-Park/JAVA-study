import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class queue1021 {
  public static void main(String[] args) {
    ArrayDeque<Integer> deque = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    int[] targets = {2, 9, 5};
    int ans = 0;

    for (int targetNum : targets){
      int index = new ArrayList<>(deque).indexOf(targetNum);
      int halfIdx = deque.size() / 2;

      if(index <= halfIdx){
      // 왼쪽으로 회전
        for (int i = 0; i <= deque.size(); i++) {
          if(deque.peek() == targetNum){
            break;
          }else {
            deque.offerLast(deque.pollFirst());
            ans++;
          }
        }
        System.out.println(deque);
      }else{
        // 오른쪽으로 회전
        for (int i = 0; i <= deque.size(); i++) {
          if(deque.peek() == targetNum){
            break;
          }else{
            deque.offerFirst(deque.pollLast());
            ans++;
          } 
  
        
        }
        System.out.println(deque); // 출력 결과: [1, 2, 3, 4, 5]
      } 

    }
    

    System.out.println(ans);

  }

}
