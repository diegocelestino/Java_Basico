public class Calculate {

    public static void main(String[] args){

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")){
            sum(x, y);
        }
        if (args[0].equals("subtrair")){
            minus(x, y);
        }
        if (args[0].equals("multiplicar")){
            fold(x, y);
        }
        if (args[0].equals("dividir")){
            divide(x, y);
        }
        System.out.println();
    }
    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void minus(int x, int y){
        System.out.println(x - y);
    }
    static void fold(int x, int y){
        System.out.println(x * y);
    }
    static void divide(int x, int y){
        System.out.println(x / y);
    }

}
