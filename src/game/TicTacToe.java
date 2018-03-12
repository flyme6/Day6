package game;

public class TicTacToe {

    static int [] [] board = new int [3] [3];

    static boolean isFull (){
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == 0)
                    return false;
        return true;
    }

    static int win() {
        for (int i = 0; i < board.length; i++) {
            int r = board[i][0] & board[i][1] & board[i][2];
            if (r != 0) return r;
        }
        for (int j = 0; j < board.length; j++) {
            int r = board[0][j] & board[1][j] & board[2][j];
            if (r != 0) return r;
        }
        {
            int r = board[0][0] & board[1][1] & board[2][1];
            if (r != 0) return r;
        }
        {
            int r = board[0][2] & board[1][1] & board[2][0];
            if (r != 0) return r;
        }
        return isFull()? 0: 3;
    }

    static void display() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                switch (board[i][j]){
                    case 0:
                        System.out.print(". ");
                        break;
                    case 1:
                        System.out.print("O ");
                        break;
                    case 2:
                        System.out.print("X ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display();
    }
}
