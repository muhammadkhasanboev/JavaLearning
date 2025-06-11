import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);

       System.out.println("enter length of the array: ");
       int len = in.nextInt();

       System.out.println("enter elements of the array: ");
       int[] numbers = new int[len];

       for(int i=0; i<len; i++){
            numbers[i] = in.nextInt();
       }
       for(int k=0; k<len-1; k++){
        for(int j=0; j<len-1-k; j++){
            if(numbers[j]>numbers[j+1]){
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
            }
        }

       }
       System.out.println("Sorted array: ");
       for(int i=0; i<len; i++){
        System.out.print(numbers[i]+" ");
       }
    }
}