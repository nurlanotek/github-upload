package practiceit.chapter2;

public class NestedNumber3 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.printf("%d",j);
                }
            }
            System.out.println();
        }
    }
}
