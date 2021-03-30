import java.util.Scanner;

public class ProcessAName5026201121 {

    public static void main(String[] args) {
        String input;
        int space;
        String firstName;
        String lastName;

        System.out.println();
        System.out.println("Type your name: ");

        Scanner scanner = new Scanner(System.in);
        input = scanner.next();

        space = input.indexOf(' ');
        firstName = input.substring(0, space);
        lastName = input.substring(space + 1);

        System.out.println(firstName.length());
        System.out.println("Your Name is: " + lastName + ", " + lastName.charAt(0) + ".");
    }

}
