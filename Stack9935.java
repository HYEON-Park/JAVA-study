public class Stack9935 {
  public static void main(String[] args) {
    //StringExplosion
    String str = "mirkovC4nizCC44pro39";
    String bomb = "C4";
    
    StringBuilder stack = new StringBuilder();
    int bombLength = bomb.length();

    for (char c : str.toCharArray()) {
      stack.append(c);
      
      if(stack.length() >= bombLength){ //폭발단어보다 길 때만 검사
        boolean isBomb = true;
        for (int i = 0; i < bombLength; i++) {
          if (stack.charAt(stack.length() - bombLength + i) != bomb.charAt(i)) {
            isBomb = false;
            break; 
          }
        }
        // 3. 일치하면 폭발 문자열 전체 길이만큼 한 번에 제거!
        if (isBomb) {
          stack.delete(stack.length() - bombLength, stack.length());
        }
      }
    }

  
    String ans =  (stack.length() == 0) ? "FRULA" : stack.toString();
    System.out.println(ans);
    
  }
}


//스택 역할         ArrayDeque       StackStringBuilder 대체 구현
//Push (쌓기)       stack.push(c)   sb.append(c)
//Pop (꺼내기)      stack.pop()     sb.deleteCharAt(sb.length() - 1)
//Peek (맨 위 확인) stack.peek()    sb.charAt(sb.length() - 1)
//isEmpty(비었는지) stack.isEmpty() sb.length() == 0