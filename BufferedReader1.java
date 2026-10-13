import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BufferdReader
 */
public class BufferedReader1 {
  //BufferdReader
  //지존 압도적으로 빠르다함...
  //InputStreamReader
  //Byte 형태의 입력을 문자 형태로 바꿔주는 번역기< 역할
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 예시 1: 한 줄에 단어 하나만 들어올 때 (공백 없음)
    // 입력: Hello


    StringTokenizer st = new StringTokenizer(br.readLine());

    char first = st.nextToken().charAt(0); // 'A'
    char second = st.nextToken().charAt(0); // 'B'
    
    System.out.println("단어 charAt: " + first); // Hello H
    System.out.println("단어 charAt: " + second); // Bye B



  }
}