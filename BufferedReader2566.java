import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReader2566 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = -1;
    int maxRow = 1;
    int maxCol = 1;

    for(int row = 1; row <= 9; row++ ){
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int col = 1; col <= 9; col++){
        int num = Integer.parseInt(st.nextToken());

        if(num > max){
          max = num;
          maxRow = row;
          maxCol = col;
        }
      }
      
    }
    System.out.println(max);
    System.out.println(maxRow + " " + maxCol);
    
  }
}
