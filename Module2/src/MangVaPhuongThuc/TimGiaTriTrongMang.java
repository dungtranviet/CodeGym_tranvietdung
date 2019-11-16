package MangVaPhuongThuc;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name'student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        int index;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                isExist = true;
                System.out.println("Position of the student "+input_name+" in the list is "+(i+1));
                break;
            }
        }
        if(!isExist){
            System.out.println("not found "+input_name+" in the list");
        }
    }
}
