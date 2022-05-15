public class Solution {

    public static boolean isSafe(int x, int y, int[][] board){

        if(x >= 0 && y >= 0 && x < board.length && y < board.length && board[x][y] == -1){
            return true;

        }
        return false;
    }
}
