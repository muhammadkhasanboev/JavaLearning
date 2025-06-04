interface calculator{
    //public  static method can be used directly in main class with interface name
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    //public  static method can be used directly in main class with interface name
    public static void subtract(int a, int b){
        System.out.println(a-b);
    }
    void multiplication(int a, int b);
    void division (int a, int b);
}

class interfaceTest implements calculator{
    public void multiplication(int a, int b){
        System.out.println(a*b);
    }
    public void division(int a, int b){
        System.out.println(a/b);
    }
}

public class interfaceUsage{
    public static void main(String[] args){
        calculator.add(7,7);
        calculator.subtract(10, 9);
        interfaceTest test = new interfaceTest();
        test.multiplication(4, 4);
        test.division(25, 5);

    }
}