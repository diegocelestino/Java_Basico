import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Diego");
        names.add("Carlinhos");
        names.add("Macaxeira");
        names.add("Dominó");



    }

    public static void Teste1(){
        List<String> names = new ArrayList<>();

        names.add("Diego");
        names.add("Carlinhos");
        names.add("Macaxeira");
        names.add("Dominó");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        int index = names.indexOf("Carlinhos");
        System.out.println(index);

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Macaxeira"));

        names.clear();
    }

    public static void Teste2() {

        List<String> names = new ArrayList<>();

        names.add("Diego");
        names.add("Carlinhos");
        names.add("Macaxeira");
        names.add("Dominó");

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

}
