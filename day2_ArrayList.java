import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day2_ArrayList {
    public static void main(String[] args) {

      //백준 2751번 / 1427번 응용
      int N = 5;
      int[] arr = new int[N];
      //List<Integer> list = new ArrayList<>();
      // list.add(3);
      // list.add(1);
      // list.add(4);
      // list.add(2);
      // list.add(5); 
      List<Integer> list = new ArrayList<>(List.of(3,1,2,4,5));

      list.sort(Collections.reverseOrder()); // 내림차순 정렬
      for (Integer integer : list) {
        System.out.println(integer);
      }

    }
}
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

// public class day2 {
//     public static void main(String[] args) {
//       //Array , ArrayList, sorting

//       // int [] arr = new int[5]; //크기고정
//       // arr[0] = 10;

//       // List<Integer> list = new ArrayList<>();//크기가변
//       // list.add(10);
      
//       //Sort
//       int[] arr = {3, 1, 4, 2};
//       Arrays.sort(arr); // 오름차순 정렬 -> [1, 2, 3, 4]

//       List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 2));
//       Collections.sort(list); // 오름차순 정렬 -> [1, 2, 3, 4]
//       list.sort(Collections.reverseOrder()) // 내림차순



//     }
// }