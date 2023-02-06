package inheritance.users;

public class AdminUser extends User {
    String email;

    public AdminUser(String username, String password, String email){
        super(username,password);
        this.email = email;
    }
}
