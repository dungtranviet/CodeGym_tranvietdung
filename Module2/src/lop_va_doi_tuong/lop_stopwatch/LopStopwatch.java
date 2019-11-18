package lop_va_doi_tuong.lop_stopwatch;

public class LopStopwatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Stopwatch stopwatch=new Stopwatch();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else {}
            }
        }
        stopwatch.end();
        System.out.println("Thời gian thực thi thuật toán selection sort 100000 số là : "+stopwatch.getElapsedTime());
    }
}
