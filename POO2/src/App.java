public class App {

    public static void main(String[] args){

        User diego = new User("Diego", "Celestino");
        User miguel = new User("Miguel", "Celestino");


        System.out.println(diego.getCount());

    }


    public static void sobrescritaDosMetodosHashEEquals(){
        User userA= new User("Tiago", "Celestino");
        User userB= new User("Diego", "Celestino");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
    }

    public static void testeDeSobrescritaDoMetodotoString(){
        User userA= new User("Diego", "Celestino");

        System.out.println(userA.toString());

    }
    public static void testaGettersESetters(){
        User[] users = new User[]{
                new User("Diego", "Celestino"),
                new User("Nathalia", "Kozikas"),
                new User("Eita", "Deus")
        };

        System.out.println(users[2].getFirstName() + " " + users[2].getLastName());
    }

}
