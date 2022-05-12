import java.util.Arrays;

public class ComparacaoArrays {

    public static void comparaArrays(){
        int[] numbersA = new int[]{1,3,5};
        int[] numbersB = new int[]{1,3,5};

        int a = 2;
        int b = 2;


        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals(numbersB));
        System.out.println(Arrays.equals(numbersA, numbersB));



    }
}
