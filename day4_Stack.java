import java.util.ArrayDeque;
import java.util.Deque;

public class day4_Stack {
  //백준9012
  public static void main(String[] args) {
    //문제: 괄호 문자열이 주어졌을 때, 괄호의 쌍이 올바르게 닫혀있는 올바른 괄호 문자열(VPS)인지 판단하는 프로그램을 작성하세요.
    Deque<Character> stack = new ArrayDeque<>();
    String str  = "(())()";
    //")("
    //"(()"
    //(((true)))
    boolean isValid = true;

    for (char c : str.toCharArray()) {// 여기서 c가 '(' 인지 ')' 인지 검사합니다!
     if (c == '(') stack.push(c);
     else if (c == ')') {
        if (stack.isEmpty()) { // 짝 맞출 '('가 없으면 에러!
            isValid = false;
            break;
        }
        stack.pop(); 
      }
     
    }
    // 1. 중간에 짝이 안 맞아서 탈출했거나(isValid == false)
    // 2. 문자를 다 돌았는데 스택에 '('가 남아있으면 잘못된 괄호
    if (!stack.isEmpty()) {
        isValid = false;
    }
    System.out.println(stack.isEmpty());
  }
}



// import java.util.ArrayDeque;
// import java.util.Deque;

// public class day4_Stack {
//   //LIFO (Last-In, First-Out)
//   //나중에 들어간 데이터가 가장 먼저 나온다
//   //최신표준/권장 java내장 Stack 대신 Deque사용

//   public static void main(String[] args) {
//     Deque<Integer> stack = new ArrayDeque<>();
//     stack.push(10);
//     stack.push(20);
//     stack.push(30);//데이터 넣기 push > 위에 쌓임

//     //System.out.println(stack.peek()); //30

//     stack.pop(); //맨 위값 30 제거
//     System.out.println(stack.peek()); //20
//     System.out.println("비어있는가? " + stack.isEmpty());//비었는지 확인
//   }
// }
