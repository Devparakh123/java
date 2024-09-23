
import java.util.Scanner;

public class switches {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("tasty");

            default -> System.out.println("not a valid fruit");
        }
    }
}
