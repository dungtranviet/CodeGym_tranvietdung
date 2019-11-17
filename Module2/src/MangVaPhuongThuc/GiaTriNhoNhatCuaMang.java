package MangVaPhuongThuc;

import java.util.Scanner;

public class GiaTriNhoNhatCuaMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int minValue;
        System.out.print("Enter size: ");
        size=scanner.nextInt();
        int []arr=new int[size];
        System.out.print("Enter elements of array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print("\narr["+i+"]: ");
            arr[i]=scanner.nextInt() ;
        }
        System.out.print("elements of array :");
        for (int element:arr) {
            System.out.print(element+"\t");
        }
        minValue=arr[0];
        for (int element:arr){
            if (minValue>element) {
                minValue=element;
            }
        }
        System.out.println("Min value of array is : "+minValue);
    }
}
