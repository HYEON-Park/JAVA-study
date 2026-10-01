import java.util.ArrayDeque;
import java.util.Deque;

public class Stack10799 {
  

  public static void main(String[] args) {
    Deque<Character> stack = new ArrayDeque<>();
    String str = "()(((()())(())()) evaluation )";
    int totalPieces = 0;
    String chkBfClose = "";
    for ( char c : str.toCharArray() ){
      if( c == '(') {
        chkBfClose = "false";
        stack.push('(');
      
      } else if( c == ')'){
        stack.pop();
        
        if(chkBfClose.equals("true")) {
          totalPieces += 1;
        } else {
          totalPieces += stack.size();
        }
        chkBfClose = "true";
      }

    }

    System.out.println("총 조각 수: " + totalPieces); // 17
  }
}
// stack.push(val) : 맨 위에 값 쌓기
// stack.pop() : 맨 위의 값 꺼내고 제거
// stack.peek() : 맨 위의 값 제거 없이 확인
// stack.isEmpty() : 비어있는지 확인 (true / false)