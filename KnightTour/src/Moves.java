public class Moves {

    public static int[] x = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
    public static int[] y = new int[]{1, 2, 2, 1, -1, -2, -2, -1};

    public static void print(){
        for (int i = 0; i < Board.length; i++){
            System.out.print(x[i]);
            System.out.print(y[i]);
            System.out.println();
        }
    }



}
