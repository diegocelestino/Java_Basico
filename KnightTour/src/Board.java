public class Board {

    public static int length = 8;
    public int[][] matrix = init_board();

    public static int[][] init_board() {
        int[][] matrix = new int[8][8];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = -1;
            }
        }
        return matrix;
    }

    public static void print(Board board){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(board.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
