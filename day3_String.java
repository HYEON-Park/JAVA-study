public class day3_String {
  public static void main(String[] args) {

    String str = "Hello World";
    //StringBuilder sb =  new StringBuilder(str);
    //sb.reverse();
    //System.out.println(sb);
    String[] words = str.split(" ");
    StringBuilder sb2 =  new StringBuilder(words[0]);
    StringBuilder sb3 =  new StringBuilder(words[1]);
    //System.out.println(sb2.reverse());
    //System.out.println(sb3.reverse());
    StringBuilder sbStr =  new StringBuilder();
    sbStr.append(sb2.reverse()).append(" ").append(sb3.reverse());
    System.out.println(sbStr);

    

  }
}


// public class day3_String {
//   public static void main(String[] args) {
//     //String, StringBuilder, Java Text Block
//     long startTime = System.currentTimeMillis();
//     String result = "";
//     for (int i = 0; i < 100000; i++) {
//       result += i; 
//     }
//     long endTime = System.currentTimeMillis(); // 종료 시간
//     System.out.println("String '+' 연산 소요 시간: " + (endTime - startTime) + " ms");    

//     startTime = System.currentTimeMillis(); // 시작 시간
//     StringBuilder sb = new StringBuilder();
//     for(int i=0; i<100000; i++){
//       sb.append(i);
//     }
//     //System.out.println(sb);
//     endTime = System.currentTimeMillis(); // 종료 시간
//     System.out.println("StringBuilder '+' 연산 소요 시간2: " + (endTime - startTime) + " ms");   

//     //어어어어어어어어어어어엄청 차이남 훨씬. 압도적.
//   }
// }
