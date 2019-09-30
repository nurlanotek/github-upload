package practiceit.chapter2;

public class SlashFigure {
    public static void main(String[] args) {
        slashFigure();

    }

    private static void slashFigure() {
        for (int i = 0; i < 6; i++) {
            // printing the right side
            for (int j = 0; j < i*2; j+=2) {
                System.out.print("\\\\");
            }

            // printing the exclamation marks
            for (int n = 0; n < 11-i*2; n++) {
                System.out.print("!!");
            }

            // printing the right side
            for (int j = 0; j < i*2; j+=2) {
                System.out.print("//");
            }

            // printing the new line
            System.out.println();
        }
    }
}
