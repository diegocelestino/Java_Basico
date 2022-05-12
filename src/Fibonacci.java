public class Fibonacci {

    public static int getValue(int fibonacci_value) {

        int a = 0, b = 1, aux;

        if (fibonacci_value <= 2) {
            return 1;
        } else {

            for (int i = 1; i < fibonacci_value; i++) {

                aux = a + b;
                a = b;
                b = aux;

            }
            return b;
        }
    }


}
