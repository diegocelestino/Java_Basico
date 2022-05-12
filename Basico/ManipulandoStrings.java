import java.util.Scanner;

public class ManipulandoStrings {

    public static void ManipulandoStrings(){

        String password = "123456";

        System.out.println("Digite sua senha");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(password.equals(pass));
    }


}
