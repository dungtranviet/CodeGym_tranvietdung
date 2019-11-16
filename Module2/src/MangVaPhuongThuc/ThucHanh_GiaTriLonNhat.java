package MangVaPhuongThuc;

import java.util.Scanner;

public class ThucHanh_GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int []arr;
        do{
            System.out.println("Enter a size :");
             size=scanner.nextInt();
             if(size>20){
                 System.out.println("size should not excess 20");
             }
        }
        while (size>20);
     arr=new int[size];
     for (int i=0;i<arr.length;i++){
         System.out.print("Enter element "+(i+1)+":");
         arr[i]=scanner.nextInt();
     }
        System.out.println("Property List:");
     for (int i=0;i<arr.length;i++){
         System.out.println(arr[i]+"\t");
     }
     int max=arr[0];
     for (int i=0;i<arr.length;i++){
         if(max<arr[i]){
             max=arr[i];
         }
     }
        System.out.println("The largest property in the List is:"+max);
    }
}
