import java.util.HashMap;
import java.util.Scanner;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, String> UserInfo = new HashMap<>();

        // Adding some user-password pairs
        UserInfo.put("a", "b");
        UserInfo.put("c", "d");
        UserInfo.put("e", "f");

        UserNameCheck(UserInfo);
    }

    public static void UserNameCheck(HashMap<String, String> UserInfo) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter your UserName:");
        String UserName = inputScanner.nextLine();

        System.out.println("Enter your Password:");
        String Password = inputScanner.nextLine();

        // Check if username exists
        if (UserInfo.containsKey(UserName)) {
            System.out.println("username matched");

            // Use .equals() for string comparison
            if (UserInfo.get(UserName).equals(Password)) {
                System.out.println("password matched");
                System.out.println("logged in");
            } else {
                System.out.println("incorrect password");
            }
        } else {
            System.out.println("username not found");
        }

        inputScanner.close();
    }
}