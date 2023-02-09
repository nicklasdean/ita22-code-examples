package interfaces;

import java.util.ArrayList;

interface PersonInterface2 {
    void sayHi();
    void setName(String name);
    int getAge();
}

class Person2 implements PersonInterface2 {
    String name;
    int age;

    public Person2(String name, int age) {
        System.out.println("I am called now");
    }

    public void sayHi() {
        System.out.println("Hi!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Person2 camilla = new Person2("Camilla", 6);
        //camilla.getAge();
    }
}