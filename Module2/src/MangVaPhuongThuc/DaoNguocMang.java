package MangVaPhuongThuc;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int []arr;
        System.out.print("Enter size:");
       do {
           size = scanner.nextInt();
           if (size>20){
               System.out.println("Size does not exceed 20");
           }
       }
       while (size>20);
       arr=new int[size];
       for (int i=0;i<arr.length;i++){
           System.out.print("Enter element arr["+(i+1)+"]:");
          arr[i]= scanner.nextInt();
       }
        System.out.println("Elements in array :");
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]+"\t");
       }
       for (int i=0;i<arr.length/2;i++){
          int temp=arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;
       }
        System.out.println("reverse array");
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]+"\t");
       }
    }
}
