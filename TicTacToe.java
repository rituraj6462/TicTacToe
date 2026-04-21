import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Performs toss and assigns symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            // Human starts
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            // Computer starts
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Displays result
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("You won the toss!");
            System.out.println("You play first.");
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first.");
        }

        System.out.println("Your symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }
}