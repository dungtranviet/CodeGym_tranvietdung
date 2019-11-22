package giai_thuat;

import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng năm bất kỳ (mm/yyyy)");
        String sDate1 = scanner.nextLine();
        Date date1 = new SimpleDateFormat("MM/yyyy").parse(sDate1);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        YearMonth yearMonth = YearMonth.of(year, month);
        System.out.println("số ngày trong tháng " + month + " năm " + year + " là " + yearMonth.lengthOfMonth());
    }
}
