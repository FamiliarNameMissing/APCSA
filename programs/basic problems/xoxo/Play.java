import java.util.Scanner;

public class Play
{
    public static void main(String[] args)
    {
        System.out.println("TicTacToe Game");
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);
        String player = "";
        
        while (!game.checkWin()) {
            if (game.getTurn() > 8) {
                System.out.println("Fine, we'll call it a draw.\nFinal Board:\n");    
                game.printBoard();
                System.exit(0);
            } else {
                game.printBoard();
                if (game.getTurn() % 2 == 0) {
                    player = "1";
                } else {
                    player = "2";
                }
                
                System.out.println("\nTurn " + (game.getTurn() + 1) + ": It is player " + player + "'s turn."); 
                
                System.out.println("Enter a spot for your move. Format your input as \"row col\"");
                int row = input.nextInt();
                int col = input.nextInt();
                
                System.out.println();
                game.takeTurn(row, col);
            
            }
        }
        
        game.printBoard();
        System.out.println("\nCongratulations, player " + player + ". You won in " + (game.getTurn()) + " turns!");
    }
}