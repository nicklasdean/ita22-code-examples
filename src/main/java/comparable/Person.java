package comparable;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Person comparingPerson) {
        System.out.println(this);
        System.out.println(comparingPerson);

        if(this.age > comparingPerson.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
