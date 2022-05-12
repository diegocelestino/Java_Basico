public class App {
    public static void main(String[] args){

        User user = new User();
        user.setFirstName("Diego");
        user.setLastName("Celestino");

        System.out.println(user.getFirstName() + " " + user.getLastName());
    }

}