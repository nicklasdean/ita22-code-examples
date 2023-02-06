package inheritance.users;

public class Application {
    public static void main(String[] args) {
        User newUser = new User("Nicklas","123");
        AdminUser newAdmin = new AdminUser("AdminNicklas", "1234", "nifr@kea.dk");

        newUser.generateNewPassword();
        newAdmin.generateNewPassword();
    }
}
