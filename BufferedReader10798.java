import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BufferedReader10798
 * 
 * 
ABCDE
abcde
01234
FGHIJ
fghij
 */
public class BufferedReader10798 {

  public static void main(String[] args) throws Exception {
    

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 5행 15열 2차원 char 배열 선언
        char[][] board = new char[5][15];

        System.out.println(board.length);
        System.out.println(board[0].length);
        System.out.println(); 

        // 2. [입력] 5줄의 문자열을 입력받아 배열에 저장
        System.out.println("5줄의 문자열을 입력하세요:");
        for (int row = 0; row < board.length; row++) {
            String str = br.readLine();
            
            // 입력받은 문자열의 길이만큼 배열에 집어넣기
            for (int col = 0; col < str.length(); col++) {
                board[row][col] = str.charAt(col);
            }
        }

        // ============================================================
        // 예시 1: 가로 방향 for문 (행 우선: row -> col)
        // ============================================================
        System.out.println("\n--- [1] 가로 방향 출력 ---");
        for (int row = 0; row < board.length; row++) {             // 0 ~ 4
            for (int col = 0; col < board[row].length; col++) {     // 0 ~ 14
                
                // 빈 칸('\0')이 아닌 실제 문자만 출력
                if (board[row][col] != '\0') {
                    System.out.print(board[row][col]);
                }
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }

        // ============================================================
        // 예시 2: 세로 방향 for문 (열 우선: col -> row) ★백준 10798번
        // ============================================================
        System.out.println("\n--- [2] 세로 방향 출력 (백준 10798번 방식) ---");
        for (int col = 0; col < board[0].length; col++) {         // 0 ~ 14 (바깥쪽!)
            for (int row = 0; row < board.length; row++) {         // 0 ~ 4  (안쪽!)
                
                // 빈 칸('\0')이 아닌 실제 문자만 이어 붙여서 출력
                if (board[row][col] != '\0') {
                    System.out.print(board[row][col]);
                }
            }
        }
        System.out.println(); // 마무리를 위한 줄바꿈



  }
}