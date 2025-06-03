// import java.util.Scanner;

// public class codeForces {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int yura = scanner.nextInt();
//         int vladik = scanner.nextInt();

//         int maxRoll = Math.max(yura, vladik);
//         int favorableOutcomes = 7 - maxRoll;
//         int totalOutcomes = 6;

//         int gcd = gcd(favorableOutcomes, totalOutcomes);
        
//         System.out.println((favorableOutcomes / gcd) + "/" + (totalOutcomes / gcd));
//         scanner.close();
//     }

//     private static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }

//class testClass <T>{
//    protected T name;
//    protected T id;
//
//    protected testClass (T name, T id){
//        this.name = name;
//        this.id = id;
//    }
//
//    protected T getName(){
//        return name;
//    }
//
//    protected T getId(){
//        return id;
//    }
//}
//
//public class codeForces{
//    public static void main(String[] args){
//        testClass <String> test = new testClass<>("Jack", "1");
//        System.out.println(test.getName()+" "+test.getId());
//    }
//}

// interface rectangle{
//      int area(int length, int height);
// }
// class recarea implements rectangle{
//    public  int area(int length, int height){
//         return length*height;
//     }
// }

// public class codeForces{
//     public static void main(String[] args){
//         recarea a = new recarea();
//         int e = a.area(1,2);
//         System.out.println(e);
//     }
// }















