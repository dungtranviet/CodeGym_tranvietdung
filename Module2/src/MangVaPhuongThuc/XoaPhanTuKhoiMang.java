package MangVaPhuongThuc;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 2, 6, 4, 2, 7, 3, 8, 3, 13, 23, 0, 0, 0, 0, 0};
        int number_del;
        int index_del;
        boolean isExit = false;
        int count = 0;
        System.out.print("các phần tử trong mảng : ");
        for (int element : arr) {
            System.out.print(element + "\t");
        }
        System.out.print("\n");
        System.out.println("Nhập vào giá trị bạn muốn xóa :");
        number_del = scanner.nextInt();
        int endIndex=arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if (number_del == arr[i]) {
                index_del = i;
                for (int j = index_del; j < endIndex; j++) {
                    arr[j] = arr[j+1];
                }
                arr[endIndex]=0;
                count++;
                isExit=true;
            }
        }
        if (isExit) {
            System.out.println("đã xóa "+count+" lần số "+number_del+" ra khỏi mảng ");
            System.out.println("mảng sau khi xóa "+number_del+" ra khỏi mảng đã cho là: ");
            for (int element:arr) {
                System.out.print(element+", ");
            }
        }
        else System.out.println("không tồn tại số "+number_del+" trong mảng");

    }
}
