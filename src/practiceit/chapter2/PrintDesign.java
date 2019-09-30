package practiceit.chapter2;

public class PrintDesign {
    public static void main(String[] args) {
//        -----1-----
//        ----333----
//        ---55555---
//        --7777777--
//        -999999999-
        printDesign();
    }

    private static void printDesign() {
        for (int i = 1; i <= 10; i+=2) {
            // print the first line
            for (int j = 0; j < (11-i)/2; j++) {
                System.out.print("-");
            }

            for (int n = 0; n < i; n++) {
                System.out.print(i);
            }

            for (int j = 0; j < (11-i)/2; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
