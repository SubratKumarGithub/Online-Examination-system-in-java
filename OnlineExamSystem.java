import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class OnlineExamSystem {
    private static final String USERNAME = "User1";
    private static String password = "123456"; // Initial password
    private static boolean loggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login Functionality
        while (!loggedIn) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (username.equals(USERNAME) && enteredPassword.equals(password)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }

        // Update Profile and Password Functionality
        System.out.print("Do you want to change the password? (yes/no): ");
        String changePasswordChoice = scanner.nextLine();
        if (changePasswordChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter current password: ");
            String currentPassword = scanner.nextLine();

            if (currentPassword.equals(password)) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                password = newPassword; // Update password
                System.out.println("Password updated successfully!");
            } else {
                System.out.println("Incorrect password. Profile update failed.");
            }
        }

        // MCQ1
        System.out.println("Question 1: What is 2 + 2?");
        System.out.println("A) 3");
        System.out.println("B) 4");
        System.out.println("C) 5");
        System.out.println("D) 6");

        System.out.print("Your answer: ");
        String answer = scanner.nextLine();

        // Check the selected answer
        if (answer.equalsIgnoreCase("B")) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer!");
        }

//MCQ2
        System.out.println("Who is the father of Computers");
        System.out.println("A) James Gosling ");
        System.out.println("B) Charles Babbage  ");
        System.out.println("C)Dennis Ritchie");
        System.out.println("D) Bjarne Stroustrup");

        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();

        // Check the selected answer
        if (answer2.equalsIgnoreCase("B")) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer!");
        }

        // Timer and Auto-submit
        Timer timer = new Timer();
        int timeLimitSeconds = 300; // 5 minutes

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up! Auto-submitting answers...");
                // Implement logic to auto-submit answers here
                timer.cancel(); // Stop the timer
            }
        }, timeLimitSeconds * 1000);

        // Logout
        System.out.print("Do you want to logout? (yes/no): ");
        String logoutChoice = scanner.nextLine();
        if (logoutChoice.equalsIgnoreCase("yes")) {
            loggedIn = false; // End the session
            System.out.println("Logged out successfully.");
        }

    scanner.close();
    }
}
