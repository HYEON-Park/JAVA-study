



// record Point(int x, int y) {} //getter,setter, equals, hashCode, toString 자동 생성

// public class day1_Record {
//     //public static void main(String[] args) {
//         //Point p = new Point(3, 5);
//         //System.out.println(p.x());
//     //}

//     // 클래스 내부 static record 선언
//     record Point(int x, int y) {}

//     public static void main(String[] args) {
//         Point p = new Point(3, 5);
//         System.out.println(p.x()); // 3
//     }    
// }


// class Point { //Point 예제
//     private double x;
//     private double y;
//     private double z;

//     public Point (double x, double y, double z) {
//         this.x = x;
//         this.y = y;
//         this.z = z;
//     }

//     public double distanceToOrigin(){
//         return Math.sqrt(x*x + y*y + z*z);
//     }

//     public double distanceTo(Point other) {
//         double dx = this.x - other.x;
//         double dy = this.y - other.y;
//         double dz = this.z - other.z;
//         return Math.sqrt(dx*dx + dy*dy + dz*dz);
//     }


//     @Override
//     public String toString() {
//         return String.format("Point(x: %.1f, y: %.1f, z: %.1f)", x, y, z);
//     }
// }

// public class day1_Record {
//     public static void main(String[] args) {
//         //System.out.println("Hello, World!");
//         Point p = new Point(1, 2, 3);
//         Point target = new Point(4, 5, 6);

//         System.out.println("Point: " + p);
//         System.out.println("target: " + target);

//         System.out.println("Distance to origin: " + p.distanceToOrigin());
//         System.out.println("Distance to target: " + p.distanceTo(target));
//     }
// }

// 기존: 클래스 선언, 필드 private final, 생성자, getter 구현 등 20줄 이상
// Java 14+ Record: 단 한 줄로 해결
// public class day1 {
//     // public static void main(String[] args) {
//     //     System.out.println("Hello, World!");
//     // }
//     record Point(int x, int y, int cost) implements Comparable<Point> {
//         @Override
//         public int compareTo(Point o) {
//             return Integer.compare(this.cost, o.cost); 

//         }

//     }
//     public static void main(String[] args) {
//         //System.out.println("Hello, World!");
//         Point p = new Point(1, 2, 3);
//         System.out.println(p.x());
//         System.out.println(p.y());
//         System.out.println(p.cost());
//     }
// }
