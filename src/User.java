public class User {

    private boolean isLogged;
    public String firstName;
    public String lastName;
    private String fullname = getFullName();


    public String getFullName(){
        return firstName + " " + lastName;
    }

}
