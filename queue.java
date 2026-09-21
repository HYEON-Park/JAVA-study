import java.util.ArrayDeque;
import java.util.Deque;
//백준2164
public class queue {
    public static void main(String[] args) {
      int N = 4; //$N = 4$인 경우
      Deque<Integer> queue = new ArrayDeque<>();

      for (int i = 1; i <= N; i++) {
          queue.offer(i);
      }
      
      //System.out.println(removed);
      while (queue.size() > 1) {
        queue.poll(); // 첫 번째 요소 제거
        
        queue.addLast(queue.poll()); 
        //queue.poll()이 값을 꺼내면서 동시에 꺼낸 그 값 자체를 반환(return)하는 
        // 메서드이기 때문에 변수에 담지 않고 그대로 인자로 전달할 수 있습니다.
      }
      System.out.println("마지막 남은 카드: " + queue.peek()); // 4

    }
}

// import java.util.ArrayDeque;
// import java.util.Deque;

// public class queue {
//   public static void main(String[] args) {
//     Deque<Integer> queue = new ArrayDeque<>();

//     queue.offer(10);
//     queue.offer(20);
//     queue.offer(30);

//     //System.out.println(queue.peek()); // 10
    
//     int removed = queue.poll();
//     //System.out.println(removed); // 10
//     //System.out.println(queue.peek()); // 20
//     //System.out.println("현재 개수: " + queue.size());

//     queue.addLast(40);
//     //System.out.println("현재 개수: " + queue.size());
//     int first = queue.getFirst();
//     System.out.println("첫 번째 요소: " + first); // 20
//     int popped_1st = queue.pollFirst();
//     System.out.println("제거된 첫 번째 요소: " + popped_1st); // 20

//     System.out.println(queue.peek()); // 30
//   }
// }

// import java.util.ArrayDeque;
// import java.util.Deque;

// public class queue {
//   public static void main(String[] args) {
//     Deque<Integer> queue = new ArrayDeque<>();

//     queue.offer(10);
//     queue.offer(20);
//     queue.offer(30);

//     System.out.println(queue.peek()); // 10
    
//     int removed = queue.poll();
//     System.out.println(removed); // 10
//     System.out.println(queue.peek()); // 20
//     System.out.println("현재 개수: " + queue.size());
//   }
// }

// queue는 FIFO(First In First Out) 구조를 가지며, ArrayDeque를 사용하여 구현할 수 있습니다. 
// offer() 메서드를 사용하여 요소를 추가하고, peek() 메서드를 사용하여 큐의 첫 번째 요소를 확인하며, 
// poll() 메서드를 사용하여 첫 번째 요소를 제거합니다. 
// size() 메서드를 통해 현재 큐에 있는 요소의 개수를 확인할 수 있습니다.