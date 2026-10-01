import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * day5_Queue
 */
public class queue1158 {

  //Queue FIFO
  public static void main(String[] args) {
    //queue.offer(10) 큐의 맨 뒤에 10을 밀어넣음
    // Queue<Integer> queue = new ArrayDeque<>();
    // queue.offer(10);
    // queue.offer(20);
    // queue.offer(30);

    // int val = queue.poll();
    // //System.out.println(val);

    // int top = queue.peek();
    // System.out.println(top);

    // queue.offer(queue.poll());

    int N = 7;
    int K = 3;
    Queue<Integer> queue = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 6, 7));
    System.out.println(queue.toString());
    //for (Integer i : queue) { // for문 사용 안에서
    while(queue.size() != 0){
      for (int i = 0; i < K-1; i++) {
        queue.offer(queue.poll());
      }
      int del = queue.poll();
    }

    System.out.println(queue.toString());
  }
  
   
}