public class Main {

    public static void main(String[] args){

        Board board = new Board();
        Board.print(board);
        Moves moves = new Moves();

        System.out.println(Moves.x[0] + " " + moves.x[0]);

        board.matrix[0][0] = 0;
        int pos = 1;
            if(!Solution.solveKnightTour(board.matrix, 0, 0, Moves.x, Moves.y, pos)){
                System.out.println("Solution does not exist");
            }
            else{
                Board.print(board);
            }

    }

}
