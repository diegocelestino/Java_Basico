public class Solution {

    public static boolean isSafe(int x, int y, int[][] board){

        if(x >= 0 && y >= 0 && x < board.length && y < board.length && board[x][y] == -1){
            return true;

        }
        return false;
    }

    public static boolean solveKnightTour(int[][] board,int curr_x, int curr_y, int[] move_x, int[] move_y, int pos){

        int new_x;
        int new_y;
        if (pos == 64){
            return true;
        }

        for (int i = 0; i < 8; i++){

            new_x = curr_x + move_x[i];
            new_y = curr_y + move_y[i];

            if(isSafe(new_x,new_y,board)) {
                board[new_x][new_y] = pos;
                if (solveKnightTour(board, new_x, new_y, move_x, move_y, pos + 1)){
                    return true;
                }
                board[new_x][new_y] = -1;
            }

        }
        return false;
    }
}
