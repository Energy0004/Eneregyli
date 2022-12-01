import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        if (s.matches("\\d\\d\\d-\\d\\d-\\d\\d\\d\\d")) {
            System.out.println(s + " is a valid social security number.");
        } else {
            System.out.println(s + " is a invalid social security number.");
        }
    }
}
