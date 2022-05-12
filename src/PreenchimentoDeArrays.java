import java.util.Arrays;

public class PreenchimentoDeArrays {

    public static void preencheArray(){
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));

        Arrays.fill(names,"Desconhecido");

        System.out.println(Arrays.toString(names));
    }

}
