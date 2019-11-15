package MangVaPhuongThuc;

public class ThucHanh_GiaTriNhoNhat {
    public static void main(String[] args) {
        int arr[]={2,8,4,-7,9,3};
        int index=minValue(arr);
        System.out.println("gia tri nho nhat trong mang la :"+arr[index]);
    }
    public static int minValue(int []arr){
        int index=0;
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(min>arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
