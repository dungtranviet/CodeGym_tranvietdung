package MangVaPhuongThuc;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr={10,0,4,6,7,0,0,0,0,0,0};
        System.out.println("elements in array :");
        for (int element:arr){
            System.out.print(element+" ,");
        }
        System.out.print("\nEnter Number You Want Insert :");
        int number=scanner.nextInt();
        boolean valid=false;
        int index;
        do {
            System.out.print("Enter Position you want insert (1 to "+(arr.length)+") : ");
            index=scanner.nextInt();
            valid=1<=index&&index<=arr.length;
            index--;
            if (!valid) {
                System.out.println("invalid");
            }
        } while (!valid);
        int spaceIndex=-1;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==0){
                spaceIndex=i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("this array can't insert");
        } else {
            if (spaceIndex > index) {
                for (int i = spaceIndex; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
            } else {
                for (int i = spaceIndex; i < index; i++) {
                    arr[i] = arr[i + 1];
                }
            }
            arr[index] = number;
        }
        System.out.println("elements in array after insert :");
        for (int element:arr){
            System.out.print(element+" ,");
        }

    }
}
