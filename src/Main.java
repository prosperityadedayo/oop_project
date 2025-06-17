import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);

            System.out.printf("Your Username is \"%s\" and your domain is \"%s\"", username, domain);

        }
        else {
            System.out.println("All emails must contain the \"@\" character");
            System.out.print("Enter your email again: ");
            email = scanner.nextLine();
        }


        scanner.close();
    }
}