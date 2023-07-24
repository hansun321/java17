package sec2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class CollectionsEx3 {

    public static void main(String[] args) {
        //입력한 월의 달력 출력하기
        System.out.print("월 입력 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, 1);
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("일\t월\t화\t수\t목\t금\t토\t");
        int cnt = 1;
        boolean isFull = false;
        while (!isFull) {
            String[] nums = new String[7];
            Arrays.fill(nums, " ");
            int idx = cnt == 1 ? dayNum - 1 : 0;
            for (int i = idx; i < 7; i++) {
                nums[i] = String.valueOf(cnt++);
                if (cnt > lastDay) {
                    isFull = true;
                    break;
                }
            }
            for (String n : nums) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }

    }
}
