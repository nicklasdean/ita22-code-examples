package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person benjamin = new Person(35, "benjamin");
        //System.out.println(benjamin);
        Person per = new Person(23, "per");
        Person hanne = new Person(65, "hanne");
        System.out.println(benjamin.compareTo(per));


        ArrayList<Person> personList = new ArrayList<>();
        personList.add(benjamin);
        personList.add(per);
        personList.add(hanne);

        System.out.println(personList);

        Collections.sort(personList);

        System.out.println(personList);
    }

}
