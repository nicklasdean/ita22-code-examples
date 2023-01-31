package inheritance.users;

import java.util.Random;

public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword(){
        this.password = "";
        String newPassword = "";
        for (int i = 0; i < 10; i++) {
            newPassword = newPassword.concat(generateRandomLetter());
        }
        System.out.println(newPassword);
        return newPassword;
    }

    private String generateRandomLetter(){
        String letters = "abcdefghijklmnopqrstuvxyz";
        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(letters.length());
        return String.valueOf(letters.charAt(randomNumber));
    }
}
