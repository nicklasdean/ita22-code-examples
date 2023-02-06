package inheritance;

public class Application {
    public static void main(String[] args) {
        User u = new User();
        u.sayHello();

        //Methods are inherited from Object class
        System.out.println("Hey hvaså" + u.toString());
        System.out.println(u.hashCode());
    }
}
