                    import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        // read number of disks from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numDisks = sc.nextInt();

        // solve Tower of Hanoi puzzle recursively
        solveHanoi(numDisks, "A", "C", "B");
    }

    // recursive method to solve Tower of Hanoi puzzle
    public static void solveHanoi(int numDisks, String source, String target, String auxiliary) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        solveHanoi(numDisks-1, source, auxiliary, target);
        System.out.println("Move disk " + numDisks + " from " + source + " to " + target);
        solveHanoi(numDisks-1, auxiliary, target, source);
    }
}
