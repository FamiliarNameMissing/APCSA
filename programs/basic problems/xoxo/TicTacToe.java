public class TicTacToe
{
    private String[][] board;
    //create board
    public TicTacToe() {
        String[][] xboard = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xboard[i][j] = "-";
            }
        }
        board = xboard;
    }
 
   private int turn;
   
   public int getTurn()
   {
       return turn;
   }
   
   public void printBoard()
   {
       System.out.println("  0 1 2");
       System.out.println("0 " + board[0][0] + " " + board[0][1] + " " + board[0][2]);
        System.out.println("1 " + board[1][0] + " " + board[1][1] + " " + board[1][2]);
        System.out.println("2 " + board[2][0] + " " + board[2][1] + " " + board[2][2]);
   }
   
   //check if space is occupied
   public boolean pickLocation(int row, int col)
   {
       if (board[row][col] == "-") {
           return true;
       } else{ 
           return false;
       }
   }
   
   //place X or O on given space
   public void takeTurn(int row, int col)
   {
       if (turn % 2 == 0) {
           board[row][col] = "X";
       } else {
           board[row][col] = "O";
       }
       turn++;
   }

   public boolean checkRow()
   {
       String in = "";
       for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board.length; j++) {
               in+= board[i][j];
           }
           //System.out.println(in);
           if (in.equals("XXX") || in.equals("OOO")) {
            return true;    
           } else {
               in = "";
           }
       }
       
       
       return false;
   }
   

   public boolean checkCol()
   {
       String in = "";
       for (int i = 0; i < board.length; i++) {   
           for (int j = 0; j < board.length; j++) {
                in+=board[j][i];
           }
           //System.out.println(in);
           if (in.equals("XXX")|| in.equals("OOO")) {
            return true;    
           } else {
               in = "";
           }
       }
       
       
       
       return false;
   }
   
   public boolean checkDiag()
   {
       String leftDown = "";
       for (int i = 0; i < board.length; i++) {
             leftDown+= board[i][i]; 
       }
       
       String rightDown = "";
       for (int i = 0; i < board.length; i++) {
            rightDown+= board[i][i];    
       }
       
       if (leftDown.equals("OOO") || leftDown.equals("XXX") || rightDown.equals("XXX") || leftDown.equals("OOO")) {
            return true;    
       } 
       
       return false;
   }
   
   //call all three to determine if there is a winner
   public boolean checkWin()
   {
       if (this.checkRow() || this.checkCol() || this.checkDiag()) {
        return true;
       } else {
           return false;
       }
   }

}