public class App {

    public static void main(String[] args){
        User[] users = new User[]{
                new User("Diego", "Celestino"),
                new User("Nathalia", "Kozikas"),
                new User("Eita", "Deus")
        };

        System.out.println(users[2].getFirstName() + " " + users[2].getLastName());
    }
}
