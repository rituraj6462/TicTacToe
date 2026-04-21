import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // Reads slot input from user
    static int getUserSlot() {
        System.out.print("Enter a slot (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
}