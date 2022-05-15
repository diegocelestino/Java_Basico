public class Main {

    public static void main(String[] args){

        Board board = new Board();
        Board.print(board);
        Moves moves = new Moves();

        System.out.println(Solution.isSafe(0, 0, board.matrix));




    }

}
