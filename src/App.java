public class App {
    public static void main(String[] args){

        User user = new User();
        user.firstName = "Diego";
        user.lastName = "Celestino";

        System.out.println(user.getFullName());
    }

}