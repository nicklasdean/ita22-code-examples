package modelling;

public class Owner {
    private String fullname;
    private int age;
    private String picture;

    public Owner(String fullname, int age, String picture) {
        this.fullname = fullname;
        this.age = age;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", picture='" + picture + '\'' +
                '}';
    }
}
