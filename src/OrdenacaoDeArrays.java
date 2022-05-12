import java.util.Arrays;

public class OrdenacaoDeArrays {

    public static void ordenaArrays(String[] args){

        int[] numbers = new int[] {2, 4, 1, 6, 8, 3, 5, 5};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));


    }
}
