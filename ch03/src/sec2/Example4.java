package sec2;

public class Example4 {
    public static void main(String[] args) {

//        for (int a = 1; a <= 5; a++) {
//            for (int b = 1; b <= 4; b++) {
//                System.out.print(b + "\t");
//            }
//            System.out.print("\n");
//        }

        /*
        1   2   3   4   5   6   7
        8   9   10  11  12  13  14
        15  16  17  18  19  20  21
        22  23  24  25  26  27  28
        29  30  31
         */
        for (int i = 0; i < 5; i++) {
            int lastDay = i == 4 ? 3 : 7;
            for (int j = 1; j <= lastDay; j++) {
                System.out.printf("%2d\t", i * 7 + j);
            }
            System.out.println();
        }

        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        /*
        6-a
        *****
        ****
        ***
        **
        *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        구구단
        2X1=2   3X1=3     ......        9X1=9
        .....................................
        2X9=18  3X9=28                  9X9=81
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%dx%d=%2d\t", j, i, j * i);
            }
            System.out.println();
        }

    }
}
